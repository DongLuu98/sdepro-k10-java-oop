package lessson_11;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);}

    public void setSpeed(int speed) {
        this.speed = speed;

    }
}
