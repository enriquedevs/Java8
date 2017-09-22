package com.java8.c6.interfacelambda;

public class Main {
	
	public static void main(String[] args) {
		Transport lamborghini = new Car("Lamborghini", "Gallardo", 2015, "manual");
		lamborghini.printDescription();
		
		// Instantiating a Transport using a Lambda Expression
		Transport bike = (d, t) -> d / t;
		bike.printDescription();
		
		// Calling static method from the interface
		Transport.printIsFuelPorwered();
		
		//Transport.printDescription(); // This is not allowed because default methods are like instance methods
	}
	
}
