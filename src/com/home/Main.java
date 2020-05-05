package com.home;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        option1();
    }

    public static void option1(){
        BarDB barDatabase = new BarDB();
        new Setup().setupBar(barDatabase);
        System.out.println(barDatabase);
    }
}
