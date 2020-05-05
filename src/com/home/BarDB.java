package com.home;

public class BarDB {

    private static final int DEFAULT_INITIAL_SIZE = 10;

    private Bar[] barArray;
    private int size;

    public BarDB() {
        barArray = new Bar[DEFAULT_INITIAL_SIZE];
    }

    public void add(Bar addedBar) {
        if (size == barArray.length) {
            expandArray();
        }
        barArray[size] = addedBar;
        size++;
    }

    public void expandArray() {
        Bar[] newArray = new Bar[barArray.length * 2];
        for (int i = 0; i < barArray.length; i++) {
            newArray[i] = barArray[i];
        }
        barArray = newArray;
    }

    public Bar getBarByIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Can't enter negative index.");
        }
        if (index >= size) {
            throw new IndexOutOfBoundsException("Size: " + size + "Index: " + index);
        }
        return barArray[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        rearrangeArray();
        for (int i = 0; i < size; i++) {
            sb.append((i + 1) + ". " + barArray[i].getName() + " (" + barArray[i].getOpeningTime() + "-" + barArray[i].getClosingTime() + ")"
                    + " distance: " + barArray[i].getDistance() + "m" + "\n");
        }
        return sb.toString();
    }

    public void rearrangeArray() {
        double[] diffArray = new double[size];
        for (int i = 0; i < size; i++) {
            barArray[i].setDistance(Setup.findDistanceInMetresBetweenTwoCoordinates(barArray[i].getLocationNAxis(), barArray[i].getLocationEAxis()));
            diffArray[i] = barArray[i].getDistance();
        }
        bubbleSort(diffArray);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (diffArray[i] == barArray[j].getDistance()){
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
}
