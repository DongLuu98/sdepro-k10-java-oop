package lessson_11;

import java.security.SecureRandom;

public class Dog extends Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSpeed() {
        return new SecureRandom().nextInt(60);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
