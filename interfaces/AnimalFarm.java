package interfaces;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {
    private ArrayList<Animal> animals;

    public void addAnimals() {
        animals = new ArrayList<Animal>(List.of(new Dog(), new Cat()));

    }

    public void visitAnimals() {
        animals.forEach(animal -> {
            animal.breath();
            animal.makeSound();
            animal.move();
        });
    }
}
