package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

    //创建连接池对象
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();

    //对外提供一个获取连接池对象的方法
    public static ComboPooledDataSource getDataSource() {
        return dataSource;
    }

    //对外提供一个获取Connection对象的方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
