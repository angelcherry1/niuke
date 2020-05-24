package com.niuke.niukeservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niuke.niukeservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeMapper extends BaseMapper<User> {
//    User getUser(@Param("id")int id);
//
//    int addUser(@Param("userName")String userName,@Param("passWord")String passWord);
}
