package com.niuke.niukeservice.controller;

import com.niuke.niukeservice.entity.BaseResponse;
import com.niuke.niukeservice.entity.User;
import com.niuke.niukeservice.service.HomeService;

import com.sun.istack.internal.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class homeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/text")
    public @ResponseBody
    String text() {
        return "你好！234";
    }

    @GetMapping("api/home/getUser")
    public @ResponseBody
    BaseResponse<User> getUser(@RequestParam int id) {
        BaseResponse<User> baseResponse=new BaseResponse<>();
        User user = homeService.getUser(id);
//        System.out.println("获得的用户数据getUser"+ user);
        if(!(user==null)){
            baseResponse.setCode(1);
            baseResponse.setMessage("数据获取成功");
            baseResponse.setResult(user);
        }else {
            baseResponse.setCode(0);
            baseResponse.setMessage("数据获取失败");
        }
        return baseResponse;
    }

    @GetMapping("api/home/deleteUser")
    public @ResponseBody
    BaseResponse<Object> deleteUser(@RequestParam int id) {
        BaseResponse<Object> baseResponse=new BaseResponse<>();

//        System.out.println("获得的用户数据getUser"+ user);
        if(homeService.deleteUser(id)){
            baseResponse.setCode(1);
            baseResponse.setMessage("删除成功");
        }else {
            baseResponse.setCode(0);
            baseResponse.setMessage("删除失败");
        }
        return baseResponse;
    }

    @CrossOrigin
    @PostMapping("api/home/addUser")
    public @ResponseBody BaseResponse<Object> addUser(@RequestParam String userName,@RequestParam String passWord){
        BaseResponse<Object> baseResponse=new BaseResponse<>();
        if(homeService.addUser(userName,passWord)==1){
            baseResponse.setCode(1);
            baseResponse.setMessage("添加成功！");
            baseResponse.setResult(null);
        }else {
            baseResponse.setCode(0);
            baseResponse.setMessage("添加失败！");
        }
        return baseResponse;
    }

    @CrossOrigin
    @PostMapping("api/home/updateUser")
    public @ResponseBody BaseResponse<Object> updateUser(@RequestParam int id,  @RequestParam String userName, @RequestParam String passWord){
        BaseResponse<Object> baseResponse=new BaseResponse<>();
        if(homeService.updateUser(id,userName,passWord)==1){
            baseResponse.setCode(1);
            baseResponse.setMessage("修改成功！");
            baseResponse.setResult(null);
        }else {
            baseResponse.setCode(0);
            baseResponse.setMessage("修改成功！");
        }
        return baseResponse;
    }
}
