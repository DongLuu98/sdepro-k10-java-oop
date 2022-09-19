package lesson_03;

public class lab_33 {
    public static void main(String[] args) {
        int myArray[] = new int[]{12, 34, 1, 16, 28};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
    }
}
