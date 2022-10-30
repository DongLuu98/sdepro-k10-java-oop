package lessson_11;

import java.util.ArrayList;
import java.util.List;

public class VelocityCaculator {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal dog = new Dog();
        dog.setName("Dog");
        Animal horse = new Horse();
        horse.setName("Horse");
        Animal tiger = new Tiger();
        tiger.setName("Tiger");
        animals.add(dog);
        animals.add(horse);
        animals.add(tiger);
        winner(animals);

    }

    public static String winner(List<Animal> AnimalList) {
        String animalWinner = null;
        int max = 0;
        for (Animal animal : AnimalList) {
            if (animal.getSpeed() > max) {
                max = animal.getSpeed();
                animalWinner = animal.getName();
            }
        }
        System.out.println("Winner is: " + animalWinner + " with the speed: " + max + "km/h");
        return animalWinner;
    }
}
