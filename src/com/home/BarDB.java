package com.home;

import java.time.LocalTime;

public class BarDB {

    private static final int DEFAULT_INITIAL_SIZE = 10;

    private Bar[] barArray;
    private int size;
    private Rearranger rearranger = new Rearranger();

    public Bar[] getBarArray() {
        return barArray;
    }

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
        System.arraycopy(barArray, 0, newArray, 0, barArray.length);
        barArray = newArray;
    }

    public void remove(Bar removedBar) {
        int i = 0;
        while (!barArray[i].equals(removedBar)) {
            i++;
        }
        if (size - 1 - i >= 0) System.arraycopy(barArray, i + 1, barArray, i, size - 1 - i);
        size--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        rearranger.rearrangeArrayByDiff(size, barArray);
        for (int i = 0; i < size; i++) {
            sb.append(i + 1).append(". ").append(barArray[i].getName()).append(" (").append(barArray[i].getOpeningTime())
                    .append("-").append(barArray[i].getClosingTime()).append(")").append(" distance: ")
                    .append(barArray[i].getDistance()).append("m").append("\n");
        }
        return sb.toString();
    }

    public String toString(LocalTime time) {
        StringBuilder sb = new StringBuilder();
        rearranger.rearrangeArrayByTime(time, size, this);
        for (int i = 0; i < size; i++) {
            sb.append(i + 1).append(". ").append(barArray[i].getName()).append(" (").append(barArray[i].getOpeningTime())
                    .append("-").append(barArray[i].getClosingTime()).append(")").append("\n");
        }
        return sb.toString();
    }


}
