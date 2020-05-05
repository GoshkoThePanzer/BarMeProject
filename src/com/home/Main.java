package com.home;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code herе
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
        System.out.println(currentTime.getHour());
        System.out.println(currentTime.getMinute());
    }

    public static void consoleEnter (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinates. ex. 43.209559 23.548355");
        double coordinateN = Double.parseDouble(input.next());
        double coordinateE = Double.parseDouble(input.next());
        Myself me = new Myself();
        me.MY_LOCATION_N_AXIS = coordinateN;
        me.MY_LOCATION_E_AXIS = coordinateE;
    }

    public static int consoleReceive (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter option");
        return Integer.parseInt(input.next());
    }

    public static void option3() {
        Map map = new Map();
        while (true) {
            map.update();

        }
    }
}
