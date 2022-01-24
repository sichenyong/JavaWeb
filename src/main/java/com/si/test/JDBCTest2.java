package com.si.test;

import java.sql.*;

public class JDBCTest2 {
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
        //3. 编写sql
        String sql = "select * from Users where id = ?";

        //4. 预编译
        PreparedStatement pst;
        pst = connection.prepareStatement(sql);
        pst.setObject(1,2); //给第1个占位符?的值复制为2

        //5.执行sql，获取结果集
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
            System.out.println("password: " + resultSet.getString("password"));
            System.out.println("email: " + resultSet.getString("email"));
            System.out.println("birthdate: " + resultSet.getDate("birthdate"));
        }

        //6.关闭链接
        resultSet.close();
        pst.close();
        connection.close();
    }
}
