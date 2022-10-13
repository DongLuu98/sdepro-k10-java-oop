package lesson_09_2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static String defaultName;

    static {
        defaultName = "Tiger Default Name";
    }

    public Tiger() {
    }



    public Tiger(String animalName, int velocityAnimal) {
        super(animalName, velocityAnimal);

    }

    public int getAnimalVelocity() {
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;
    }

    public static String getDefaultName() {
        if (defaultName == null) {
            return "Tiger1";
        }
        return defaultName;
    }
}
