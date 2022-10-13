package lesson_09_2;

public class Animal {

    public String animalName;
    public int animalVelocity;
    protected static String defaultName;

    public Animal(){

    }

    public Animal(String animalName, int animalVelocity) {
        this.animalName = animalName;
        this.animalVelocity = animalVelocity;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalVelocity() {
        return animalVelocity;
    }

    public void setAnimalVelocity(int animalVelocity) {
        this.animalVelocity = animalVelocity;
    }
}
