package com.niuke.niukeservice.service;

import com.niuke.niukeservice.entity.User;
import org.springframework.stereotype.Service;


public interface HomeService {
     User getUser(int id);
     boolean deleteUser(int id);

     int addUser(String userName,String passWord);

     int updateUser(int id,String userName,String passWord);
}
