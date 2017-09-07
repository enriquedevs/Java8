package com.java8.c5.innerclassenum;

public class Car extends Transport {
	private String transmision;
    private CarHelper carHelper = new CarHelper();

    public Car(String brand, String model, int year, String transmision) {
        super(brand, model, year);
        this.transmision = transmision;
    }
    
    @Override
    public float calculateVelocity(float distance, float time) {
        return this.carHelper.calculateVelocity(distance, time);
    }
    
    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    // CarHelper Member Inner Class
    public class CarHelper {
        public float calculateVelocity(final float distance, final float time) {
            return distance / time;
        }
    }
}
