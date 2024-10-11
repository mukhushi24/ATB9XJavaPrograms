package Task.Task_11102024;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class Lab_013 {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if (animal instanceof Dog) {
            System.out.println("The object is an instance of Dog.");
        } else if (animal instanceof Cat) {
            System.out.println("The object is an instance of Cat.");
        } else {
            System.out.println("The object is NOT an instance of Dog or Cat.");
        }
    }
}
