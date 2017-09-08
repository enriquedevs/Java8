package com.java8.c6.interfacelambda;

@FunctionalInterface
public interface Transport {
	
	// Attributes are public static and final implicitly in interfaces
	boolean IS_FUEL_POWERED = false;
	
	// Abstract Methods are public implicitly
	float calculateVelocity(float distance, float time);
	
	// Since Java 8, static methods are allowed in interfaces and also are public implicitly
	static void printIsFuelPorwered() {
		System.out.println("This Transport is " + (IS_FUEL_POWERED ? "Fuel Powered" : "Not Fuel Powered"));
	}
	
	// Since Java 8, default methods are introduced in interfaces to have a default implementation of a instance method
	default void printDescription() {
		System.out.println("This is a generic Transport");
	}
	
}
