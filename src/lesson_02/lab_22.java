package lesson_02;

import java.util.Scanner;

public class lab_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int a = scanner.nextInt();
        if(a%2==0)
        {
            System.out.printf(" %d is an even number ", a);
        }
        else {
            System.out.printf(" %d is an odd number ", a);
        }
    }
}
