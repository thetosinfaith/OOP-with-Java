package Inheritance;

/**Write a Java program to create a class called Vehicle with a method called drive().
 * Create a subclass called Car that overrides the drive() method to print "Repairing a car"
 */
public class Vehicle {

    protected void drive(){
        System.out.println("Repairing a vehicle");
    }

    public void doSomething(){
        drive();
    }



}
