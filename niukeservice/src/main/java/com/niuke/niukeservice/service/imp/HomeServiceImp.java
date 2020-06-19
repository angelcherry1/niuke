package com.niuke.niukeservice.service.imp;

import com.niuke.niukeservice.entity.BaseResponse;
import com.niuke.niukeservice.entity.User;
import com.niuke.niukeservice.mapper.HomeMapper;
import com.niuke.niukeservice.service.HomeService;
import com.niuke.niukeservice.uitil.UtileBaseRespone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HomeServiceImp implements HomeService {

    @Autowired
    private HomeMapper homeMapper;
    @Override
    public BaseResponse<Object> getUser(int id) {


        User user1 = homeMapper.selectById(id);
        if(user1==null){
            return UtileBaseRespone.create(0,"信息获取失败",null);
        }
            return UtileBaseRespone.create(1,"获取成功！",user1);
    }

    @Override
    public BaseResponse<Object> login(String userName,String passWord) {
        User login = homeMapper.login(userName);
        if(login==null){
            return UtileBaseRespone.create(0,"用户名错误",null);
        }else if (!(login.getPassWord().equals(passWord))){
            return UtileBaseRespone.create(0,"密码错误",null);
        }
        return UtileBaseRespone.create(1,"登录成功",login);
    }

    @Override
    public BaseResponse<Object> deleteUser(int id) {
        int i = homeMapper.deleteById(id);
        if(i==1){
            return UtileBaseRespone.create(1,"删除成功！",null);
        }
        return UtileBaseRespone.create(0,"删除失败！",null);
    }

    @Override
    public BaseResponse<Object> addUser(String userName, String passWord) {
        User user=new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        User login = homeMapper.login(userName);
        if(login==null){
            int insert = homeMapper.insert(user);
            if(insert==1){
                return UtileBaseRespone.create(1,"用户注册成功！",user);
            }else {
                return UtileBaseRespone.create(1,"用户注册失败！",null);
            }
        }else {
           return UtileBaseRespone.create(0, "用户名已经存在", null);
        }
    }

    @Override
    public BaseResponse<Object> updateUser(int id,String userName, String passWord) {
        int i = homeMapper.updateUser(userName, passWord, id);
        if(i==1){
            return UtileBaseRespone.create(1,"修改成功",null);
        }
        return UtileBaseRespone.create(0,"修改失败！",null);
    }


}
