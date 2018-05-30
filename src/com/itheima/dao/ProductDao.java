package com.itheima.dao;

import com.itheima.domain.Product;
import com.itheima.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDao {
    public static List<Product> getSearch(int pageNo, int pageSize) throws SQLException {
        //获取核心类对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());

        //搜索
        String sql ="Select * from product limit ? , ?";
        List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class), (pageNo-1)*pageSize, pageSize);
        return list;
    }

    public static int getCount() throws SQLException {
        //获取核心类对象
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());

        //搜索
        String sql ="Select count(*) from product";
        Long count = (Long) queryRunner.query(sql, new ScalarHandler());
        return count.intValue();
    }
}
