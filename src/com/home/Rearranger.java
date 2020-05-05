package com.home;

import java.time.LocalTime;

public class Rearranger {
    public void rearrangeArraybyDiff(int size, Bar[] barArray) {
        double[] diffArray = new double[size];
        for (int i = 0; i < size; i++) {
            barArray[i].setDistance(Setup.findDistanceInMetresBetweenTwoCoordinates(barArray[i].getLocationNAxis(), barArray[i].getLocationEAxis()));
            diffArray[i] = barArray[i].getDistance();
        }
        bubbleSort(diffArray);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (diffArray[i] == barArray[j].getDistance()) {
                    Bar temp = barArray[i];
                    barArray[i] = barArray[j];
                    barArray[j] = temp;
                }
            }
        }
    }

    void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public void rearrangeArraybyTime(LocalTime time, int size, Bar[] barArray){
        double[] timeArray = new double[size];
        for (int i = 0; i < size; i++) {
            barArray[i].setDistance(Setup.findDistanceInMetresBetweenTwoCoordinates(barArray[i].getLocationNAxis(), barArray[i].getLocationEAxis()));
            timeArray[i] = barArray[i].getDistance();
        }
        bubbleSort(timeArray);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (timeArray[i] == barArray[j].getDistance()) {
                    Bar temp = barArray[i];
                    barArray[i] = barArray[j];
                    barArray[j] = temp;
                }
            }
        }
    }
}
