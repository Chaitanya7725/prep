package ObjectOrientedProgramming.Polymorphism;

public class demo {

    public static void main(String[] args) {
        System.out.println("Inside the demo of interface");

        Dog dog=new Dog();
        dog.makeSound();
        dog.makeSound("hahaha");

        Cat cat=new Cat();
        cat.makeSound();

    }
}
