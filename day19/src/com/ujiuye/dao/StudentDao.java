package com.ujiuye.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.entity.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDao {

    ComboPooledDataSource dataSource =new ComboPooledDataSource();
    QueryRunner qr= new QueryRunner(dataSource);
    public List<Student> findAll() {
        String sql = "select * from student";
        try {
            return qr.query(sql, new BeanListHandler<Student>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int findByCount() {

        String sql = "select * from student";
        try {
            return qr.query(sql, new BeanListHandler<Student>(Student.class)).size();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<Student> findStudentByLimit(int cpage, int size) {

        String sql = "select * from student limit ?,?";

        try {
            return qr.query(sql, new BeanListHandler<Student>(Student.class), (cpage - 1) * size, size);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
