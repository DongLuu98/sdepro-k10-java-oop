package lesson_02;

import java.util.Scanner;

public class lab_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your height(m): ");
        float height = scanner.nextFloat();
        System.out.println("Please input your weight(kg):");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        if (BMI < 18.5) {
            System.out.printf("BMI: %.1f ---> You are Underweight ", BMI);
            System.out.printf("\nYou should gain %.1f kg to reach Normal Weight: ", (18.5 - BMI) * height * 2);

        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("BMI: %.1f ---> You are Normal weight ", BMI);

        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.printf("BMI: %.1f ---> You are Overweight ", BMI);
            System.out.printf("\nYou should lose %.1f kg to reach Normal Weight: ", (BMI - 24.9) * height * 2);
        } else {
            System.out.printf("BMI: %.1f ---> You are Obesity ", BMI);
            System.out.printf("\nYou should lose %.1f kg to reach Normal Weight: ", (BMI - 24.9) * height * 2);
        }
    }
}
