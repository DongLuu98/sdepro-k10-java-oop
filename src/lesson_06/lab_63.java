package lesson_06;

import java.util.Scanner;

public class lab_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your String: ");
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        String digits = "";
        for (char character : charArray) {
            if(Character.isDigit(character)) {
                digits += character;
            }
        }
        System.out.println(digits);
    }
}
