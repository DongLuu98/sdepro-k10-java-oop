package lesson_10;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;
    private boolean isFlyAble;

    private Animal(Builder builder) {
        this.speed = builder.speed;
        this.isFlyAble = builder.isFlyAble;
        this.name = builder.name;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isFlyAble() {
        return this.isFlyAble;
    }

    //Inner Class
    public static class Builder {
        private String name;
        public boolean isFlyAble;
        private int speed;


        Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public Builder isFlyAble(boolean isFlyAble) {
            this.isFlyAble = isFlyAble;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
