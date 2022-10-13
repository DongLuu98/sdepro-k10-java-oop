package lesson_09_2;

import java.security.SecureRandom;

public class Horse extends Animal{
    private static String defaultName;

    static {
        defaultName = "Horse Default Name";
    }

    public Horse() {
    }


    public int getAnimalVelocity() {
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }


    public Horse(String animalName, int velocityAnimal) {
        super(animalName, velocityAnimal);

    }

    public static String getDefaultName() {
        if (defaultName == null) {
            return "Horse1";
        }
        return defaultName;
    }
}
