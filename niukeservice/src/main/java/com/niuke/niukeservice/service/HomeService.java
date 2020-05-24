package com.niuke.niukeservice.service;

import com.niuke.niukeservice.entity.User;
import org.springframework.stereotype.Service;


public interface HomeService {
     User getUser(int id);

     int addUser(String userName,String passWord);
}
