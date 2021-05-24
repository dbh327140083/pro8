package com.ujiuye.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/findUser")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        ArrayList<String> list = new ArrayList<>();
        list.add("liushoushang");
        list.add("qiuxin");
        list.add("pgone");

        for (String name : list) {
            if (username.equals(name)) {
                //用户名已存在
                resp.getWriter().print(1);
                //结束方法
                return;
            }
        }

        resp.getWriter().print(0);
    }
}
