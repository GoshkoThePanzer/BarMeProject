package com.home;

import java.time.LocalTime;

public class BarDB {

    private static final int DEFAULT_INITIAL_SIZE = 10;

    private Bar[] barArray;
    private int size;
    private Rearranger rearranger;

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
        rearranger.rearrangeArraybyDiff(size, barArray);
        for (int i = 0; i < size; i++) {
            sb.append((i + 1) + ". " + barArray[i].getName() + " (" + barArray[i].getOpeningTime()
                    + "-" + barArray[i].getClosingTime() + ")" + " distance: " + barArray[i].getDistance() + "m" + "\n");
        }
        return sb.toString();
    }

    public String toString(LocalTime time) {
        StringBuilder sb = new StringBuilder();
        rearranger.rearrangeArraybyTime(time, size, barArray);
        for (int i = 0; i < size; i++) {
            sb.append((i + 1) + ". " + barArray[i].getName() + " (" + barArray[i].getOpeningTime()
                    + "-" + barArray[i].getClosingTime() + ")" + "\n");
        }
        return sb.toString();
    }


}
