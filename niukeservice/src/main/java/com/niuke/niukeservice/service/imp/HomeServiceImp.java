package com.niuke.niukeservice.service.imp;

import com.niuke.niukeservice.entity.User;
import com.niuke.niukeservice.mapper.HomeMapper;
import com.niuke.niukeservice.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public int addUser(String userName, String passWord) {
        User user=new User();
        user.setUserName(userName);
        user.setPassWord(passWord);

        return homeMapper.insert(user);
    }
}
