package com.java8.c5.innerclassenum;

public class Main {
	
	public static void main(String[] args) {
        Car audi = new Car("Audi", "R8", 2017, "manual");
        System.out.println("Audi velocity: " + audi.calculateVelocity(200, 2) + " km/h");
        
        Motorcycle harvey = new Motorcycle("Harvey", "Street-750", 2015, "curved");
        System.out.println("Harvey velocity: " + harvey.calculateVelocity(200, 2) + " km/h");
        System.out.println("Motrocycle RPM: " + Motorcycle.MotorcycleHelper.calculateRPM(2000, 1) + " RPM");
        
        // Local inner class Airplane (Java 8 only)
        class Airplane extends Transport {
            private int altitude;
            public Airplane(String brand, String model, int year, int altitude) {
                super(brand, model, year);
                this.altitude = altitude;
            }
            @Override
            public float calculateVelocity(float distance, float time) {
                 return distance / time;
            }
            public int getAltitude() {
                return altitude;
            }
            public void setAltitude(int altitude) {
                this.altitude = altitude;
            }
        }
        
        // Instantiating Airplane
        Airplane aeromexicoBoeing = new Airplane("Aeromexico", "Boeing", 2013, 150);
        System.out.println("Boeing velocity: " + aeromexicoBoeing.calculateVelocity(700, 1) + " km/h");
        
        // Instantiating Transport by Anonymous class
        Transport bike = new Transport("Mclaren", "Tarmac", 2017) {
            @Override
            public float calculateVelocity(float distance, float time) {
                 return distance / time;
            }
        };
        System.out.println("Bike velocity: " + bike.calculateVelocity(30, 1) + " km/h");
        
        // Using PowerState Enum
        bike.setPowerState(PowerState.ON);
        System.out.println("Bike's power state: " + bike.getPowerState());
        System.out.println("Bike's power state description: " + bike.getPowerState().getDescription());
        System.out.println("Bike's power state number: " + bike.getPowerState().getStateNumber());
        switch(bike.getPowerState()) {
            case ON: System.out.println("The bike is ON"); break;
            case OFF: System.out.println("The bike is OFF"); break;
            case DISABLED: System.out.println("The bike is DISABLED"); break;
            default: System.out.println("Invalid value");
        }
    }
}
