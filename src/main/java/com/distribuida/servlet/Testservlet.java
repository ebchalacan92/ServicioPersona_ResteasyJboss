package com.distribuida.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.inject.Inject;
//import javax.sql.DataSource;

public class Testservlet{
	
	//@Inject
	//private static DataSource datasource;
	
public static void main(String[] args) {
    try (Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/distribuida", "postgres", "admin")) {

        System.out.println("Java JDBC PostgreSQL Example");
      

        System.out.println("Connected to PostgreSQL database!");
        Statement statement = connection.createStatement();
        System.out.println("Reading car records...");
        System.out.printf("%-30.30s  %-30.30s%n", "Nombre", "Direccion");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM persona");
        while (resultSet.next()) {
            System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("nombre"), resultSet.getString("direccion"));
        }

    } 
     catch (SQLException e) {
        System.out.println("Connection failure.");
        e.printStackTrace();
    }
}
}



