package com.si.test;

import org.junit.Test;

import java.sql.*;

public class TestJDBC {
    @Test
    public void Test() {
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useUnicode=true&useSSL=true&timeZone=utc";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        try {
            //1.加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.连接数据库 代表数据库
            connection = DriverManager.getConnection(url, username, password);
            //3.通知数据库开启事务 false开启 true关闭
            connection.setAutoCommit(false);

            String sql1 = "update account set money = money - 100 where name = 'A'";
            connection.prepareStatement(sql1).executeUpdate();

            //制造错误
            // int i = 1/0;
            String sql2 = "update account set money = money + 100 where name = 'B'";
            connection.prepareStatement(sql2).executeUpdate();

            // 提交事务
            connection.commit();
            System.out.println("提交成功！");
        } catch (Exception throwables) {

            //出现异常就通知数据库回滚事务
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void c() {
        try{
            int i = 1/1;
            System.out.println("try");
        } catch (ArithmeticException e) {
            System.out.println("catch");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
