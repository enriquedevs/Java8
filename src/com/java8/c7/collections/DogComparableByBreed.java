package com.java8.c7.collections;

public class DogComparableByBreed implements Comparable<DogComparableByBreed>{

	private String breed;
	private String name;
	private Integer age;
	
	public DogComparableByBreed(String breed, String name, Integer age) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	
	@Override
    public int compareTo(DogComparableByBreed d) {
        int result = breed.compareTo(d.getBreed());
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
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
