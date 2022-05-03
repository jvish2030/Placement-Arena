/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author jatin
 */
public class DbUtil {

    private static Connection dbConnection = null;

    public static Connection getConnection() {
        if (dbConnection != null) {
            return dbConnection;
        } else {
            try {
                InputStream inputStream = DbUtil.class.getClassLoader()
                        .getResourceAsStream("Db.properties");
                Properties properties = new Properties();
                properties.load(inputStream);
                String dbDriver = properties.getProperty("dbDriver");
                String connectionUrl = properties
                        .getProperty("connectionUrl");
                String userName = properties.getProperty("userName");
                String password = properties.getProperty("password");
                Class.forName(dbDriver).newInstance();
                dbConnection = DriverManager.getConnection(connectionUrl,
                        userName, password);

            } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            }
        }
        System.out.println("conn   "+dbConnection);
        return dbConnection;
    }
}
