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
        User user = homeMapper.getUser(id);
        System.out.println(user.toString());
        return user;
    }
}
