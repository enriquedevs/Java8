package com.java8.c18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

	public static Connection getConnection() throws SQLException{
		final String url = "jdbc:sqlite:src/com/java8/c18/jdbc/todo.db";
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Connected!");
		return conn;
	}
}
