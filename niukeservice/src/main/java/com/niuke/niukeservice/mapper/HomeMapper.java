package com.niuke.niukeservice.mapper;

import com.niuke.niukeservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeMapper {
    User getUser(@Param("id")int id);
}
