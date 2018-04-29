package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args){
        DbSingleton instance = DbSingleton.getInstance();
        long timeBefore = 0;
        long timeAfter = 0;
        System.out.println("instance = " + instance);

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter-timeBefore);

        Statement sta;
        try {
            sta = conn.prepareStatement("SELECT * from ADDRESS");
            //int count = sta.executeUpdate("");
            System.out.println("Table created. "+ sta.toString());
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter-timeBefore);
    }
}
