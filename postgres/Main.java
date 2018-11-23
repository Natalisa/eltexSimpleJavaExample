package com.company;

import com.google.gson.*;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    static final String DB_URL = "jdbc:postgresql://localhost:5433/db";
    static final String USER = "postgres";
    static final String PASS = "sibsutis";

    public static void main(String[] args) throws SQLException {
        PhoneBook phoneBook = new PhoneBook();
        Person newP = new Person("Nata", "545645");
        newP.addPhone("345654");

        Gson gson = new Gson();
        String JSON = gson.toJson(newP);
        System.out.println(JSON);

        Person user = gson.fromJson(JSON, Person.class);
        System.out.println(user);



        System.out.println("Testing connection to PostgreSQL JDBC");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }


        Statement st = null;
        try {
            st = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = null;
        try {
            rs = st.executeQuery("SELECT * FROM phonebook");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (rs.next())
        {
                System.out.println(rs.getString(1)+" "
                        + rs.getString(2)+" "
                        +rs.getString(3));
        }
        rs.close();
        st.close();


    }


}
