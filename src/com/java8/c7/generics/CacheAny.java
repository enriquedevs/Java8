package com.java8.c7.generics;

public class CacheAny <T>{

	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
	public void printArray(T[] genericArray){
		for(T arrayElement: genericArray){
			System.out.print(String.format("%s ", arrayElement));
		}
		System.out.println();
	}
	
}
