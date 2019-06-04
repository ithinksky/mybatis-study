package com.ithinksky.dao;

import com.ithinksky.entity.UserEntity;

import java.sql.*;

/**
 * @author tengpeng.gao
 */
public class UserMapper {

    public Connection getConn() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatis-study?useUnicode=true&useSSL=false&characterEncoding=utf8";
        String username = "root";
        String password = "adminto";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int insert(UserEntity userEntity) {
        Connection conn = getConn();
        int i = 0;
        String sql = " insert into user(username, password, age, birthday) values( ?, ?, ?, ?) ";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, userEntity.getUsername());
            preparedStatement.setString(2, userEntity.getPassword());
            preparedStatement.setInt(3, userEntity.getAge());
            preparedStatement.setDate(4, new java.sql.Date(userEntity.getBirthday().getTime()));
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }



}
