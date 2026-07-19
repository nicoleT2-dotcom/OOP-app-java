package com.plants;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            String[] speciesOptions = {"Snake Plant", "Peace Lily", "Pothos", "Spider Plant"};
            String[] lightOptions = {"Low to bright indirect", "Medium indirect", "Low to bright indirect", "Bright indirect"};
            int[] potSizeOptions = {7, 9, 6, 8};
            double[] priceOptions = {12.99, 16.25, 9.99, 11.00};
            boolean[] petSafeOptions = {false, false, true, true};


        System.out.println("SELECT AN OPTION");
        System.out.println("1. PLANT");
        System.out.println("2. POT (WIP)");
        int choice = scanner.nextInt();

        if(choice == 1 ){
            System.out.println("You chose option 1: Plant");
            System.out.println("Here are your plant options:");
            for (int i = 0; i < speciesOptions.length; i++) {
                System.out.println((i + 1) + ". " + speciesOptions[i]);
            }

            System.out.println("Pick the number of plants you would like to create");
            int amount = scanner.nextInt();

            Plant[] plants = new Plant[amount];

            for (int i = 0; i < amount; i++) {
                System.out.println("Pick plant number" + (i + 1) + " — choose from plants (1-" + speciesOptions.length + "):");
                int pick = scanner.nextInt();
                int index = pick - 1;

                plants[i] = new Plant(
                        speciesOptions[index],
                        lightOptions[index],
                        potSizeOptions[index],
                        priceOptions[index],
                        petSafeOptions[index]
                );
            }

            System.out.println("You created " + amount + " plant(s) from option 1: Plant");

            for (int i = 0; i < amount; i++) {
                System.out.println(plants[i].getSpecies() + " needs " + plants[i].getLightNeeds() + " light");
            }

        } else {
            System.out.println("This option is still a work in progress.");
        }


    }

 }
// stretch goal, add price and boolean to final loop, adding prices together and distinguishing which plants are safe and not safe in the total amount of plants chosen.