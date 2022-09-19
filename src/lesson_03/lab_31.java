package lesson_03;

public class lab_31 {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myArray = new int[arrayLength];
        int countEven = 0;
        int countOdd = 0;
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                countEven++;
            } else if (myArray[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.printf("Even numbers: %d \n", countEven);
        System.out.printf("Odd numbers: %d", countOdd);
    }
}
