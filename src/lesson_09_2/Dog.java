package lesson_09_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    private static String defaultName;

    static {
        defaultName = "Dog Default Name";
    }

    public Dog() {

    }



    public Dog(String animalName, int velocityAnimal) {
        super(animalName, velocityAnimal);

    }

    public int getAnimalVelocity() {
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;
    }

    public static String getDefaultName() {
        if (defaultName == null) {
            return "Dog";
        }
        return defaultName;
    }
}
