package interfaces;

public interface Animal {
    void makeSound();

    void move();

    default void breath() {
        System.out.println("Breathing");
    }
}
