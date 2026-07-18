package com.plants;

//object
public class Plant {
    private String species;
    private String lightNeeds;
    private int potSize;
    private double price;
    private boolean isPetSafe;


   //constructor
    public Plant(String species, String lightNeeds, int potSize,double price, boolean isPetSafe ){
        this.species = species;
        this.lightNeeds = lightNeeds;
        this.potSize = potSize;
        this.price = price;
        this.isPetSafe = isPetSafe;


    }

    //getters and setters
    public String getSpecies(){ return species;

    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getLightNeeds(){ return lightNeeds;

    }

    public void setLightNeeds(String lightNeeds){
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

    public boolean IsPetSafe(){ return isPetSafe;

    }

    public void setPetSafe(boolean isPetSafe ){
        this.isPetSafe = isPetSafe;
    }

}
