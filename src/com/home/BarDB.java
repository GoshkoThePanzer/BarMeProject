package com.home;

public class BarDB {

    private static final int DEFAULT_INITIAL_SIZE = 10;

    private Bar[] barArray;
    private int size;

    public BarDB() {
        barArray = new Bar[DEFAULT_INITIAL_SIZE];
    }

    public int add(Bar addedBar) {
        if (size == barArray.length) {
            expandArray();
        }
        barArray[size] = addedBar;
        size++;
        return size;
    }

    public void expandArray() {
        Bar[] newArray = new Bar[barArray.length * 2];
        for (int i = 0; i < barArray.length; i++){
            newArray[i] = barArray[i];
        }
        barArray = newArray;
    }

    public Bar getBarByIndex (int index){
        if (index < 0) {
            throw new IllegalArgumentException("Can't enter negative index.");
        }
        if (index >= size){
            throw new IndexOutOfBoundsException("Size: " + size + "Index: " + index);
        }
        return barArray[index];
    }
}
