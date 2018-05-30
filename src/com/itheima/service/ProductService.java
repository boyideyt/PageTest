package com.itheima.service;

import com.itheima.dao.ProductDao;
import com.itheima.domain.PageBean;
import com.itheima.domain.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {

    //将查询回的数据转换为json格式
    public static PageBean getResult(int pageNo, int pageSize) throws SQLException {
        PageBean pageBean = new PageBean();
        List<Product> list = ProductDao.getSearch(pageNo, pageSize);
        int count = ProductDao.getCount();
        pageBean.setList(list);
        pageBean.setProductCount(count);
        int totalPage = (count+pageSize-1)/pageSize;
        pageBean.setTotalPage(totalPage);


        //转换为json
        return pageBean;
    }
}
