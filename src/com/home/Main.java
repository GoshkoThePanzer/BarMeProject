package com.home;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // write your code here
        option1();
        option2();
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
}
