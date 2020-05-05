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
        int limit = size;
        for (int i = 0; i < limit; i++){
            if (removedBar.equals(barArray[i])){
                for (int j = i; j < limit - 1; j++){
                    barArray[j] = barArray[j+1];
                }
            }
        }
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
        rearranger.rearrangeArrayByTime(time, size, barArray, this);
        for (int i = 0; i < size; i++) {
            sb.append(i + 1).append(". ").append(barArray[i].getName()).append(" (").append(barArray[i].getOpeningTime())
                    .append("-").append(barArray[i].getClosingTime()).append(")").append("\n");
        }
        return sb.toString();
    }


}
