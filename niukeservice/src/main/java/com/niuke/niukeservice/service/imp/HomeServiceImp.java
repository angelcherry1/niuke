package com.niuke.niukeservice.service.imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.niuke.niukeservice.entity.User;
import com.niuke.niukeservice.mapper.HomeMapper;
import com.niuke.niukeservice.service.HomeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class HomeServiceImp implements HomeService {

    @Autowired
    private HomeMapper homeMapper;
    @Override
    public User getUser(int id) {


        User user1 = homeMapper.selectById(id);
//        System.out.println("获得的用户数据"+ user1);
        if(user1==null){
            return null;
        }
            return user1;
    }

    @Override
    public User login(String userName) {
        if(homeMapper.login(userName)==null){
            return null;
        }
        return homeMapper.login(userName);
    }

    @Override
    public boolean deleteUser(int id) {
        int i = homeMapper.deleteById(id);
        if(i==1){
            return true;
        }
        return false;
    }

    @Override
    public int addUser(String userName, String passWord) {
        User user=new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        return homeMapper.insert(user);
    }

    @Override
    public int updateUser(int id,String userName, String passWord) {
        return homeMapper.updateUser(userName,passWord,id);
    }


}
