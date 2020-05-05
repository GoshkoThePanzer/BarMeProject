package com.home;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option){
            case 1: option1();break;
            case 2: option2();break;
            case 3: option3();break;
            default:break;
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

    }
}
