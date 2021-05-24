package com.ujiuye.service;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.entity.PageBean;
import com.ujiuye.entity.Student;

import java.util.List;

public class StudenService {
    StudentDao dao= new StudentDao();

    public PageBean<Student> findAll(String currentPage,String pageSize) {

        if (currentPage==null || currentPage.trim().equals("")) {
            currentPage = "1";
        }
        if (pageSize==null || pageSize.trim().equals("")) {
            pageSize = "3";
        }
        int cpage = Integer.parseInt(currentPage);
        int size = Integer.parseInt(pageSize);
        PageBean<Student> pb = new PageBean<>();
        pb.setCurrentPage(cpage);
        pb.setPageSize(size);

        //查询总条数
        int totalCount= dao.findByCount();
        pb.setTotalCount(totalCount);
        //计算总页数
        int totalPage =totalCount%size==0?totalCount/size:totalCount/size+1;
        pb.setTaotalPage(totalPage);
        //根据用户想看的页码+想看条数查询
        List<Student> list =dao.findStudentByLimit(cpage,size);
        pb.setList(list);
        return   pb;
    }
}
