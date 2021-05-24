package com.ujiuye.entity;

import java.util.List;

public class PageBean<T> {
    //当前页
    private int currentPage;
    //每页显示条数
    private int pageSize;
    //总条数
    private int totalCount;
    //总页数
    private int taotalPage;

    //查询到的数据 根据想看的页码+每页显示条数
    private List<T> list;

    public PageBean() {
    }

    public PageBean(int currentPage, int pageSize, int totalCount, int taotalPage, List<T> list) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.taotalPage = taotalPage;
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTaotalPage() {
        return taotalPage;
    }

    public void setTaotalPage(int taotalPage) {
        this.taotalPage = taotalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
