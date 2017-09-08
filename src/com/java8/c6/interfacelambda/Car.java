package com.java8.c6.interfacelambda;

public class Car implements Transport {
	
	private String brand;
    private String model;
    private int year;
    private String transmision;
    
	public Car(String brand, String model, int year, String transmision) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.transmision = transmision;
	}
	
	@Override
	public float calculateVelocity(float distance, float time) {
		return distance / time;
	}
	
	@Override
	public void printDescription() {
		System.out.println(String.format("This is a %s %s", brand, model));
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
    
}
