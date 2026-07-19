package com.plants;

//turn Plant class into abstract class.
public abstract class Plant {
    private String species;
    private LightNeeds lightNeeds;
    private int potSize;
    private double price;
    private boolean isPetSafe;


   //Constructor: sets all 5 attributes when a plant object is created
    public Plant(String species, LightNeeds lightNeeds, int potSize,double price, boolean isPetSafe ) {
        this.species = species;
        this.lightNeeds = lightNeeds;
        this.potSize = potSize;
        this.price = price;
        this.isPetSafe = isPetSafe;
    }

    // Getters and setters: provide controlled access to the private attributes above.
    // Getters return the current value of a field and setters allow that value to be changed.
    public String getSpecies(){ return species;

    }

    public void setSpecies(String species){
        this.species = species;
    }

    public LightNeeds getLightNeeds(){ return lightNeeds;

    }

    public void setLightNeeds( LightNeeds lightNeeds){
        this.lightNeeds = lightNeeds;
    }

    public int getPotSize(){ return potSize;

    }

    public void setPotSize(int potSize ){
        this.potSize = potSize;
    }

    public double getPrice(){ return price;

    }

    public void setPrice(double price ){
        this.price = price;
    }

    public boolean isPetSafe(){ return isPetSafe;

    }

    public void setPetSafe(boolean isPetSafe ){
        this.isPetSafe = isPetSafe;
    }


    private String formatPrice(){
        return "£" +price;

    }
    // Public method combining species name with formatted price to display string showing species and price
    public String getSummary(){
        return species + " " + formatPrice();

    }

    // Abstract method (not implemented here)
    //each subclass must provide its own version of this abstract method
    public abstract String getCareInstructions();

}
