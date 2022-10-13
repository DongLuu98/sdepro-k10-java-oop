package lesson_10;

import java.util.Arrays;
import java.util.List;

public class VelocityCaculator {
    public static Animal testVelocityAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal animal : animals) {
            if (!animal.isFlyAble()) {
                if (winner == null) {
                    winner = animal;
                } else {
                    if (winner.getSpeed() < animal.getSpeed()) {
                        winner = animal;
                    }
                }
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().name("Tiger").speed(100).isFlyAble(false).build();
        Animal horse = new Animal.Builder().name("Horse").speed(75).isFlyAble(false).build();
        Animal dog = new Animal.Builder().name("Dog").speed(60).isFlyAble(false).build();
        Animal goose = new Animal.Builder().name("Goose").speed(20).isFlyAble(true).build();
        Animal falcon = new Animal.Builder().name("Falcon").speed(120).isFlyAble(true).build();
        Animal eagle = new Animal.Builder().name("Eagle").speed(121).isFlyAble(true).build();


        VelocityCaculator VelocityCalculator = null;
        Animal winner = VelocityCalculator.testVelocityAnimal(Arrays.asList(tiger, horse, dog, goose, falcon, eagle));

        System.out.println("Winner is: " + winner.getName() + " with speed " + winner.getSpeed());
    }
   
}
