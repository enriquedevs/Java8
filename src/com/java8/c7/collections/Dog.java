package com.java8.c7.collections;

public class Dog {
	
	private String breed;
	private String name;
	private Integer age;
	
	public Dog(String breed, String name, Integer age) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
    public String toString() {
        return String.format("Dog: %s, Breed: %s, Age: %s", name, breed, age);
    }
	
}
