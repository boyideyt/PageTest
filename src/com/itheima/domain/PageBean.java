package com.itheima.domain;

import java.util.List;

public class PageBean {
    private int productCount;
    private List<Product> list;
    private int totalPage;


    public PageBean() {
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "productCount=" + productCount +
                ", list=" + list +
                ", totalPage=" + totalPage +
                '}';
    }
}
