package com.niuke.niukeservice.service;

import com.niuke.niukeservice.entity.User;
import org.springframework.stereotype.Service;


public interface HomeService {
     //用户查询
     User getUser(int id);
     //用户登录
     User login(String userName);
     boolean deleteUser(int id);
     //用户注册
     int addUser(String userName,String passWord);
     //用户账号修改
     int updateUser(int id,String userName,String passWord);
}
