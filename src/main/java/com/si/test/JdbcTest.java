package com.si.test;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        characterEncoding=utf-8&useUnicode=true 解决中文乱码
        useSSL=true 安全连接
        timeZone=utc 时区
         */
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useUnicode=true&useSSL=true&timeZone=utc";
        String username = "root";
        String password = "123456";

        //1.加载驱动类
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.连接数据库 代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. 向数据库发送sql对象的Statement： curd
        Statement statement = connection.createStatement();

        //4.编写sql
        String sql = "select * from Users where id = 1";

        //5.执行查询sql语句 返回一个结果集
        ResultSet resultSet = statement.executeQuery(sql);

        /*
        sql = "delete * from Users where id = 4";
        //i == 受影响的行数
        int i = statement.executeUpdate(sql);
        */


        while (resultSet.next()) {
            System.out.println("id:" + resultSet.getObject("id") + "name:" + resultSet.getObject("name"));
        }

        //6.关闭连接 释放资源 先开的后关
        resultSet.close();
        statement.close();
        connection.close();

    }
}
