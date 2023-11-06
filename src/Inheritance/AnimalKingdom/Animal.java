package Inheritance.AnimalKingdom;

/**Build a program that simulates an "Animal Kingdom" hierarchy.
 * Start with a base Animal class and create derived classes for various animals, such
 * as Lion, Giraffe, Eagle, and Fish. Each class should have properties and methods that are
 * specific to the type of animal, while still inheriting common attributes from the Animal class.
 */

public abstract class Animal {

    protected void maneColour(){
        System.out.println("This is for a lion");
    }

    public abstract void soarAltitude();
}
