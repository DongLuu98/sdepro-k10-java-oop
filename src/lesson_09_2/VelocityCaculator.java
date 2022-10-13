package lesson_09_2;

import java.util.ArrayList;
import java.util.List;

public class VelocityCaculator {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        animals.add(dog);
        animals.add(horse);
        animals.add(tiger);
        testVelocityAnimal(animals);
    }
    public static void testVelocityAnimal(List<Animal> animals) {
        int max = 0;
        int count = 0;
        for (Animal animal : animals) {
            if (max < animal.getAnimalVelocity()) {
                max = animal.getAnimalVelocity();
                count++;
            }

        }

        System.out.println("Winner is: " + animals.get(count - 1).getClass().getSimpleName() + " with speed:" + max + "km/h");
    }
}
