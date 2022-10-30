package lessson_11;

import java.security.SecureRandom;

public class Horse extends Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }
}
