package lesson_02;

import java.util.Scanner;

public class lab_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your height(m): ");
        float height = scanner.nextFloat();
        System.out.println("Please input your weight(kg):");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        if (BMI < 18.5) {
            System.out.printf("BMI: %f ---> You are Underweight ", BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("BMI: %f ---> You are Normal weight ", BMI);
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.printf("BMI: %f ---> You are Overweight ", BMI);
        } else {
            System.out.printf("BMI: %f ---> You are Obesity ", BMI);
        }
    }
}
