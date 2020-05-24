package com.niuke.niukeservice.controller;

import com.niuke.niukeservice.service.HomeService;
import com.niuke.niukeservice.service.imp.HomeServiceImp;

public class text {
    public static void main(String[] arge){
         HomeService homeService=new HomeServiceImp();
        System.out.println(""+homeService.getUser(1));
    }
}
