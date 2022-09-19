package lesson_03;

public class lab_32 {
    public static void main(String[] args) {

        int myArray[] = new int[]{1, 2, 3, 4, 5};
        int Minium = myArray[0];
        int Maximum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < Minium) {
                Minium = myArray[i];
            }
        }
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > Maximum) {
                Maximum = myArray[i];
            }
        }
        System.out.printf("Minimum: %d \n", Minium);
        System.out.printf("Maximum: %d", Maximum);

    }
}
