package interfaces;

public class Dog implements Animal {
    public void move() {
        System.out.println("Bound");
    }

    public void makeSound() {
        System.out.println("Woof");
    }
}
