
package com.java8.c5.innerclassenum;

public enum PowerState {
    OFF("The power is off", 0),
    ON("The power is on", 1),
    DISABLED("Not working", -1);
    
    private final String description;
    private final int stateNumber;

    // Constructor of PowerState and receive as parameter the enun tuple values (description, stateNumber)
    private PowerState(String description, int stateNumber) {
        this.description = description;
        this.stateNumber = stateNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getStateNumber() {
        return stateNumber;
    }
    
}
