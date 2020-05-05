package com.home;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        while (true) {
            System.out.println("Enter option: " + '\n' + "1: open all bars" + '\n'+ "2: open opened bars" + '\n' + "3: show map of bars");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }

    public static void option1() {
        BarDB barDatabase = new BarDB();
        new Setup().setupBar(barDatabase);
        System.out.println(barDatabase.toString());
    }

    public static void option2() {
        BarDB barDatabase = new BarDB();
        new Setup().setupBar(barDatabase);
        LocalTime currentTime = LocalTime.now();
        System.out.println(barDatabase.toString(currentTime));
    }

    public static void option3() {
        Map map = new Map();
        while (true) {
            map.update();

        }
    }
}
