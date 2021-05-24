package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.entity.PageBean;
import com.ujiuye.entity.Student;
import com.ujiuye.service.StudenService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAll")
public class StudentServlet extends HttpServlet {

    StudenService service= new StudenService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        PageBean<Student>  pb=  service.findAll(currentPage,pageSize);
        List<Student> list = pb.getList();
        for (Student student : list) {

            String file = student.getFile();

            student.setFile("http://localhost:8080/img/"+file);
        }
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(pb);
        resp.getWriter().print(s);
    }



}
