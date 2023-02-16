package ObjectOrientedProgramming.Polymorphism;

public class Dog implements Animal {

    public Dog(){
        System.out.println("in the hidden constructor");
    }

    public void makeSound() {
        System.out.println("Woof");
    }

    public void makeSound(String sound) {
        System.out.println("Woof"+sound);//Overloading
    }


}
