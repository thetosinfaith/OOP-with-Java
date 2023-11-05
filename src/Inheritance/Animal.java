package Inheritance;

/**Write a Java program to create a class called Animal with a method called makeSound().
 Create a subclass called Cat that overrides the makeSound() method to bark.
 */
public class Animal {

    protected void makeSound() {
        System.out.println("Animal Sound!");
    }

    public void doSomething(){
        makeSound();
    }


}