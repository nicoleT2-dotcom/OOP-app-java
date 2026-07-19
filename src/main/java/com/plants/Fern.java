package com.plants;

//create a Fern subclass of the abstract Plant class using extends to inherit attributes from Plant
public class Fern extends Plant {

    //constructor to pass all values to Plant constructor
    public Fern (String species, LightNeeds lightNeeds, int potSize,double price, boolean isPetSafe ){
        super (species, lightNeeds, potSize, price, isPetSafe);
    }

    @Override //use override method to fulfil the abstract method from Plant using Fern's care instructions
    public String getCareInstructions() {
        return "Keep soil moist and avoid direct sunlight.";
    }

}
