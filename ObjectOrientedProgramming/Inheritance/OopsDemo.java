package ObjectOrientedProgramming.Inheritance;

public class OopsDemo {

    public static void main(String[] args) {
        System.out.println("This is a demo");

        Dog dog=new Dog();
        dog.setName("jack");
        dog.setHeight(1.3);
        System.out.println("Dog Name is "+dog.getName()+" with height "+ dog.getHeight());

        Cat cat=new Cat();
        cat.setName("Jinny");
        System.out.println("Cat name is "+cat.getName());

    }
}
