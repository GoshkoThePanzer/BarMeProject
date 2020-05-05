package com.home;

public class Map {

    BarDB barDataBase;
    public static Display display;
    private InputManager input;
    public static double MAP_START_X_CONST = 43.226279;
    public static double MAP_START_Y_CONST = 23.524003;
    public static double MAP_CONST = 0.070321;

    Map() {
        barDataBase = new BarDB();
        display = new Display(600, 600, "Map");
        init();
        input = new InputManager();
    }

    public void init() {
        display.addTexture(new TextureManager(0, 0, 1, "assets\\map.png"));
        showListOfBars();
    }

    public void update() {
        input.listener();
    }

    public void showListOfBars() {
        System.out.println("mapconst: " + MAP_CONST);
        new Setup().setupBar(barDataBase);
        Bar[] barArray = barDataBase.getBarArray();
        for (int i = 0; i < barArray.length; i++) {
            System.out.println((i + 1) + " " + barArray[i].getName() + " " + barArray[i].getMapX() + " " + barArray[i].getMapY());
        }
    }

    public void showMapsOnMap() {

    }
}
