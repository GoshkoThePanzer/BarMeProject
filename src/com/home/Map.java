package com.home;

public class Map {

    BarDB barDataBase;
    public static Display display;

    Map() {
        barDataBase = new BarDB();
        display = new Display(600, 600, "Map");
        init();
    }

    public void init() {
        display.addTexture(new TextureManager(0, 0, 1, "assets\\map.png"));
    }

    public void showListOfBars() {
        Bar[] barArray = barDataBase.getBarArray();
        for (int i = 0; i < barArray.length; i++) {
            System.out.println((i + 1) + " " + barArray[i].getName());
        }
    }

    public void showMapsOnMap() {

    }
}
