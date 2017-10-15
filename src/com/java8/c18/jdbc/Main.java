package com.java8.c18.jdbc;

public class Main {
	public static void main(String[] args) {
		EmployeeService.getAll().forEach(e -> System.out.println("Name: " + e.getName()));
	}
}
