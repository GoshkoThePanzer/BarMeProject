package com.home;

public class BarDB {

    private static final int DEFAULT_INITIAL_SIZE = 10;

    private Bar[] barArray;
    private int size;

    public BarDB() {
        barArray = new Bar[DEFAULT_INITIAL_SIZE];
    }

    public int add(Bar addedBar){
        if (size == barArray.length){
            // TODO Expand Array
        }
        barArray[size] = addedBar;
        size++;
        return size;
    }
}
