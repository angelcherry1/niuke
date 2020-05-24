package com.niuke.niukeservice.controller;

import com.niuke.niukeservice.entity.BaseResponse;
import com.niuke.niukeservice.entity.User;
import com.niuke.niukeservice.service.HomeService;

import com.niuke.niukeservice.service.imp.HomeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class homeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/text")
    public @ResponseBody
    String text() {
        return "你好！234";
    }

    @GetMapping("getUser")
    public @ResponseBody
    BaseResponse<User> getUser(@RequestParam int id) {
        BaseResponse<User> baseResponse=new BaseResponse<>();
        User user = homeService.getUser(id);
        if(!user.toString().isEmpty()){
            baseResponse.setCode(1);
            baseResponse.setMessage("数据获取成功");
            baseResponse.setResult(user);
        }else {
            baseResponse.setCode(0);
            baseResponse.setMessage("数据获取失败");
        }

        return baseResponse;
    }
}
