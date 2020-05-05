package com.home;

public class Map {

    public static BarDB barDataBase;
    public static Display display;
    private InputManager input;
    public static TextureManager textureMap = new TextureManager(0, 0, 1, "assets\\map.png");

    Map() {
        barDataBase = new BarDB();
        display = new Display(600, 600, "Map");
        init();
        input = new InputManager();
    }

    public void init() {
        showListOfBars();
        display.addTexture(textureMap);
    }

    public void update() {
        input.listener();
    }

    public void showListOfBars() {
        new Setup().setupBar(barDataBase);
        Bar[] barArray = barDataBase.getBarArray();
        for (int i = 0; i < barArray.length; i++) {
            System.out.println((i + 1) + " " + barArray[i].getName() + " " + barArray[i].getMapX() + " " + barArray[i].getMapY());
            if(i < 9) barDataBase.getBarArray()[i].setTexture(23, 23, 1, "assets\\" + (i + 1) + "-Number-PNG.png");
        }
    }
}
