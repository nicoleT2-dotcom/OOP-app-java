## Plant Shop app.

### Java console application.

This app lets a user browse a list of plants, choose how many plants they would like to create and create the corresponding Plant objects while displaying key attributes for each object that has been created.

### How to run
1. Run from `Main.java`.
2. follow the instruction in the console by
- Selecting option 1 to create plants (option 2 is a WIP).
- Choose how many plants you would like to create.
- For each plant enter (1-4) corresponding to the plant list shown.

The app will display a summary of each plant created including:
- Price.
- light needs.
- and care instructions.


Example of Plant shop 

``` java 
SELECT AN OPTION
1. PLANT
2. POT (WIP)
   1
   You chose option 1: Plant
   Here are your plant options:
1. Snake Plant
2. Peace Lily
3. Pothos
4. Spider Plant
   Pick the number of plants you would like to create
   2
   Pick plant number1 — choose from plants (1-4):
   1
   Pick plant number2 — choose from plants (1-4):
   4
   You created 2 plant(s) from option 1: Plant
   Snake Plant £12.99 needs LOW light. Care:Keep soil moist and avoid direct sunlight.
   Spider Plant £11.0 needs BRIGHT light. Care:Keep soil moist and avoid direct sunlight.

Process finished with exit code 0
```

This project demonstrated the use of OOP concepts:

### Classes and Objects
Plant is an abstract class with 5 private attributes (species, lightNeeds, potSize, price, isPetSafe), a constructor, and getters/setters for each.
### Inheritance & Abstraction 
Plant is abstract and declares an abstract method, `getCareInstructions()`. Fern extends Plant, inheriting all shared attributes/behavior and providing its own implementation of `getCareInstructions()`.
### Enums 
LightNeeds is an enum (LOW, MEDIUM, BRIGHT), used both when defining preset plant data and when displaying a plant's light requirements.
### Encapsulation 
all Plant fields are private, accessed only through public getters/setters.
### Methods 
the program includes private methods (e.g. `formatPrice())`, public methods, void methods (setters), and methods with return types (getters, `getSummary()`, `getCareInstructions()`).
### Control flow & loops 
conditional statements handles menu branching; for loops handle displaying the plant list, collecting user picks, and building/printing the created Plant objects.
### User input
Scanner is used throughout to read the user's menu choice, desired quantity, and plant selections.

