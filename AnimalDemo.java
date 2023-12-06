import java.util.Scanner;

class Animal {
    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Override makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    // Override makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an Animal object
        Animal genericAnimal = new Animal();
        System.out.println("Calling makeSound() for generic Animal:");
        genericAnimal.makeSound();
        System.out.println(); // Adding a line break for better readability

        // Create a Dog object
        Dog myDog = new Dog();
        System.out.println("Calling makeSound() for Dog:");
        myDog.makeSound();
        System.out.println(); // Adding a line break for better readability

        // Create a Cat object
        Cat myCat = new Cat();
        System.out.println("Calling makeSound() for Cat:");
        myCat.makeSound();

        scanner.close();
    }
}
