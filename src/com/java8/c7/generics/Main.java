package com.java8.c7.generics;

public class Main {
	
	public static void main(String[] args) {
		
		// Autoboxing
		Integer objectInteger = 1;
		// Unboxing
		int primitiveInteger = new Integer(2);
		
		Integer[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"a", "b", "c", "d", "e"};
		
		CacheAny cacheAnyGeneric = new CacheAny(); // The Generic Type is not defined, in this case the Type is defined as Object
		cacheAnyGeneric.printArray(integers);
		cacheAnyGeneric.printArray(strings);
		Main.printArray(integers);
		Main.printArray(strings);
		
		CacheAny<String> cacheAnyString = new CacheAny<>(); // Diamond Inference (since Java 7)
		CacheAny<Integer> cacheAnyInteger = new CacheAny<Integer>(); // Without Diamond Inference (Java 6 or earlier)
		
		cacheAnyString.setElement("string element");
		System.out.println(cacheAnyString.getElement());
		cacheAnyString.printArray(strings);
		//cacheAnyString.printArray(integers); // Not allowed because the type was defined as String
		
		cacheAnyInteger.setElement(objectInteger);
		System.out.println(cacheAnyInteger.getElement());
		cacheAnyInteger.printArray(integers);
		//cacheAnyInteger.printArray(strings); // Not allowed because the type was defined as Integer
		
	}
	
	// generic method
	public static <T> void printArray(T[] genericArray){
		for(T arrayElement: genericArray){
			System.out.print(String.format("%s ", arrayElement));
		}
		System.out.println();
	}
	
}
