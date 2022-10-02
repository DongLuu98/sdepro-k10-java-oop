package lesson_06;

import java.util.Scanner;

public class lab_61 {
    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String[] splitTime = time.split(" ");
        int  minutesNumber = 0;
        int hourNumber = 0;
        for (int i = 0; i < splitTime.length; i++) {
            if (splitTime[i].contains("hrs")){
                String  spitTimeHour = splitTime[i].replaceAll("[^0-9]", "");
                hourNumber = hourNumber + Integer.parseInt(spitTimeHour);
                minutesNumber = hourNumber * 60;
            }
            if (splitTime[i].equals("minutes")) {
                minutesNumber = minutesNumber + Integer.parseInt(splitTime[i-1]);
            }
        }
        System.out.printf("Time after convert to minutes is %d", minutesNumber);
    }
}
