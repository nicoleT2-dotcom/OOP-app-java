package com.plants;

// Import built in scanner to read inputs
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Scanner reads input typed by the user from the console
        Scanner scanner = new Scanner(System.in);


        // Preset plant data, stored as arrays

        String[] speciesOptions = {"Snake Plant", "Peace Lily", "Pothos", "Spider Plant"};
            LightNeeds[] lightOptions = {LightNeeds.LOW, LightNeeds.MEDIUM, LightNeeds.LOW, LightNeeds.BRIGHT};
            int[] potSizeOptions = {7, 9, 6, 8};
            double[] priceOptions = {12.99, 16.25, 9.99, 11.00};
            boolean[] petSafeOptions = {false, false, true, true};

        // Display the menu: user picks which type of object to create
        System.out.println("SELECT AN OPTION");
        System.out.println("1. PLANT");
        System.out.println("2. POT (WIP)"); //option 2 is a work-in-progress
        int choice = scanner.nextInt();


       // Only option 1 Plant is fully implemented
        //set up conditional statements for option 1 that runs the full Plant creation flow from menu --> input --> loop --> summary
        if(choice == 1 ){
            System.out.println("You chose option 1: Plant");
            System.out.println("Here are your plant options:");
            //loop through speciesOption's length to show the species options without hardcoding length of species
            for (int i = 0; i < speciesOptions.length; i++) {
                System.out.println((i + 1) + ". " + speciesOptions[i]);
            }

            //print out  string (question) of how many plants you would like
            System.out.println("Pick the number of plants you would like to create");
            int amount = scanner.nextInt(); //intake the user input

            // create an array and store the amount of plants to be created
            Plant[] plants = new Plant[amount];

            for (int i = 0; i < amount; i++) {
                // Ask the user to pick a plant by typing a number from the list shown earlier
                System.out.println("Pick plant number" + (i + 1) + " — choose from plants (1-" + speciesOptions.length + "):");
                int pick = scanner.nextInt(); // intake the user input
                int index = pick - 1;


                //Build a Fern object (Plant subclass) using the matching plant traits

                plants[i] = new Fern(
                        speciesOptions[index],
                        lightOptions[index],
                        potSizeOptions[index],
                        priceOptions[index],
                        petSafeOptions[index]
                );
            }

            System.out.println("You created " + amount + " plant(s) from option 1: Plant");

            // Loop through the now filled plants array to display a summary, light needs, and care instructions for each one.
            for (int i = 0; i < amount; i++) {
                System.out.println(plants[i].getSummary() + " needs " + plants[i].getLightNeeds() + " light. Care:" + plants[i].getCareInstructions());
            }

        } else { //if you pick option 2 console shows WIP
            System.out.println("This option is still a work in progress.");
        }


    }

 }
