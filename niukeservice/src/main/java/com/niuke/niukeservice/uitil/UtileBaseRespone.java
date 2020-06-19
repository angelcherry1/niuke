package com.niuke.niukeservice.uitil;

import com.niuke.niukeservice.entity.BaseResponse;
import com.niuke.niukeservice.entity.User;

public class UtileBaseRespone {
    private static BaseResponse  b = null;

    public static <T> BaseResponse<T> create(int code,String message,T data){
        if(b==null){
            b=new BaseResponse();
            b.setCode(code);
            b.setMessage(message);
            b.setResult(data);
        }else {
            b.setCode(code);
            b.setMessage(message);
            b.setResult(data);
        }
        return b;
    }
}
