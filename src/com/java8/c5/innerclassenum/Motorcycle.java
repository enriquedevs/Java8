
package com.java8.c5.innerclassenum;

public class Motorcycle extends Transport {
    private String typeOfHandlebar;

    public Motorcycle(String brand, String model, int year, String typeOfHandlebar) {
        super(brand, model, year);
        this.typeOfHandlebar = typeOfHandlebar;
    }
    
    @Override
    public float calculateVelocity(float distance, float time) {
        // We have to instantiate MotorcycleHelper to call the instance method calculateVelocity
        return new Motorcycle.MotorcycleHelper().calculateVelocity(distance, time);
    }

    public String getTypeOfHandlebar() {
        return typeOfHandlebar;
    }

    public void setTypeOfHandlebar(String typeOfHandlebar) {
        this.typeOfHandlebar = typeOfHandlebar;
    }
    
    // MotorcycleHelper static inner class
    public static class MotorcycleHelper {
        public float calculateVelocity(final float distance, final float time) {
            return distance / time;
        }
        public static float calculateRPM(final int revolutions, final int minutes){
            return (float)(revolutions / minutes);
        }
    }
}
