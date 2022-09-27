package lesson_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_04 {
    public static void main(String[] args) {
        List<Integer> arrayList = randomArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        printMenu();
        while (isContinuing) {
            System.out.print("\n Please select option: ");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    printArrayList(arrayList);
                    break;
                case 2:
                    findMaxValue(arrayList);
                    break;
                case 3:
                    findMinValue(arrayList);
                    break;
                case 4:
                    search(arrayList);
                    break;
                case 5:
                    System.out.println("Exit!!!");
                    isContinuing = false;
            }


        }

    }

    public static void printMenu() {
        System.out.print("\n====MENU====\n");
        System.out.print("1. Print all numbers\n");
        System.out.print("2. Print maximum value\n");
        System.out.print("3. Print minimum value\n");
        System.out.print("4. Search number\n");
        System.out.print("5. Exit\n");
    }

    public static List<Integer> randomArrayList() {
        List<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input array length: ");
        int arrayLength = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            myList.add(i, randomNumber);
        }
        return myList;
    }

    public static void printArrayList(List<Integer> myList) {
        System.out.print("All numbers are: ");
        for (int number : myList) {
            System.out.print(number + " ");
        }
    }

    public static void findMaxValue(List<Integer> myList) {
        int maxValue = myList.get(0);
        for (int number : myList) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Maximum value is: " + maxValue);
    }

    public static void findMinValue(List<Integer> myList) {
        int minValue = myList.get(0);
        for (int number : myList) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Minimum value is : " + minValue);
    }


    public static void search(List<Integer> myList) {
        System.out.print("Please input the number you want to search: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i : myList) {
            if (myList.get(i) == number) {
                System.out.println(number + " is existed in arraylist");
            } else {
                System.out.println(number + " is not existed in arraylist");
            }
        }
    }
}
