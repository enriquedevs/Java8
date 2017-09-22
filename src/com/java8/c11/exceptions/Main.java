package com.java8.c11.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) {
		tryCatchFinallyExample();
		tryWithResourcesExample();
		propagatingExceptionExample();
	}
	
	private static void tryCatchFinallyExample() {
		try {
			System.out.println(23 / 0);
		} catch (Exception e) {
			System.err.println("There was an Exception");
		} finally {
			System.out.println("Finally execution...");
		}
		
		InputStream in = null;
		try {
			System.out.println("Opening the File...");
			in = new FileInputStream("missingfile.txt");
			System.out.println("File opened");
		} catch (IOException ioe) {
			System.err.println("There was a problem opening the file");
		} finally {
			System.out.println("Finally execution...");
			try {
				if (in != null) in.close();
			} catch (IOException ioe) {
				System.err.println("There was a problem closing the file");
			}
		}
		
		try {
			System.out.println("Opening the File...");
			in = new FileInputStream("src/com/java8/c11/exceptions/existingfile.txt");
			System.out.println("File opened");
		} catch (IOException ioe) {
			System.err.println("There was a problem opening the file");
		} finally {
			System.out.println("Finally execution...");
			try {
				if (in != null) in.close();
			} catch (IOException ioe) {
				System.err.println("There was a problem closing the file");
			}
		}
	}
	
	private static void tryWithResourcesExample() {
		System.out.println("Opening the File...");
		try (InputStream in = new FileInputStream("src/com/java8/c11/exceptions/existingfile.txt")) {
			System.out.println("File opened");
		} catch (IOException ioe) {
			System.err.println("There was a problem opening the file");
		} 
	}
	
	private static void propagatingExceptionExample() {
		try {
			methodWithExceptionPropagation();
		} catch (NullPointerException ne) {
			System.err.println("There was a Null Pointer Exception");
		}
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException ne) {
			System.err.println("There was a Null Pointer Exception");
		}
	}
	
	private static void methodWithExceptionPropagation() throws NullPointerException {
		Object o = null;
		System.out.println(o.toString());
	}
}
