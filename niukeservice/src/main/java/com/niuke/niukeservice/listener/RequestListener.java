package com.niuke.niukeservice.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: crm23
 * @description: 请求监听器
 * @author: August
 * @create: 2019-01-18 16:01
 **/
@WebListener
public class RequestListener implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent sre)  {
//        //将所有request请求都携带上httpSession
//        ((HttpServletRequest) sre.getServletRequest()).getSession();
        ServletRequest servletRequest = sre.getServletRequest();
//        String id1 = servletRequest.get("id");

        System.out.println("------------------请求创建");


    }
    public RequestListener() {
        // TODO Auto-generated constructor stub
    }

    public void requestDestroyed(ServletRequestEvent arg0)  {
        // TODO Auto-generated method stub
    }
}
