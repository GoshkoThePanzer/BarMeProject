package com.home;

import java.time.LocalTime;
import java.util.Arrays;

public class Rearranger {
    public void rearrangeArrayByDiff(int size, Bar[] barArray) {
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

    public void rearrangeArrayByTime(LocalTime time, int size, Bar[] barArray, BarDB barDB) {
        //future development - it's not ready!
        double[] timeArray = new double[size];
        int limit = size;
        boolean isOpen;
        for (int i = 0; i < limit; i++){
            if (barArray[i].getOpeningTime().isBefore(barArray[i].getClosingTime())){
                isOpen = checkIfOpen(barArray[i].getOpeningTime(), barArray[i].getClosingTime(), time, 1);
            } else {
                isOpen = checkIfOpen(barArray[i].getOpeningTime(), barArray[i].getClosingTime(), time, 2);
            }
            if (!isOpen) {
                barDB.remove(barArray[i]);
            }
        }
        for (int i = 0; i < size; i++){
            double timeDiff;
            if (barArray[i].getOpeningTime().isBefore(barArray[i].getClosingTime())){
                timeDiff = calculateTimeDiff(time, barArray[i].getClosingTime());
            } else timeDiff = calculateTimeDiff(barArray[i].getClosingTime(), time);
            if (timeDiff < 0) throw new IllegalArgumentException("Difference can't be negative!");
            timeArray[i] = timeDiff;
        }
        System.out.println(Arrays.toString(timeArray));
        bubbleSort(timeArray);
        System.out.println(Arrays.toString(timeArray));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (timeArray[i] == calculateTimeDiff(time, barArray[j].getClosingTime())) {
                    Bar temp = barArray[i];
                    barArray[i] = barArray[j];
                    barArray[j] = temp;
                }
            }
        }

    }
    public boolean checkIfOpen (LocalTime timeMin, LocalTime timeMax, LocalTime time, int flag){
        if (flag == 1) return time.isAfter(timeMin) && time.isBefore(timeMax);
        else return time.isAfter(timeMin) || time.isBefore(timeMax);
    }

    public double calculateTimeDiff(LocalTime time, LocalTime timeMax){
        return timeMax.getHour() * 60 - time.getHour() * 60
                + timeMax.getMinute() - time.getMinute();
    }
}
