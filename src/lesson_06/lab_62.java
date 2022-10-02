package lesson_06;

import java.util.Scanner;

public class lab_62 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int count = 0;
        while (count < 3) {
            System.out.print("Input Password: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            if (userInput.equals(myPassword)) {
                System.out.println(" =>> Login successfully");
                break;
            } else {
                System.out.println(" ## Enter wrong password");
                count++;
            }
        }
        if (count >= 3) {
            System.out.println(" Enter the wrong password, please login later");
        }
    }
}
