package com.home;

public class Map {

    public BarDB barDataBase;
    public static Display display;
    private InputManager input;
    public static double MAP_START_X_CONST = 43.226279;
    public static double MAP_START_Y_CONST = 23.524003;
    public static double MAP_CONST = 0.070321;
    public static double ONE_PIXEL = 0.070321 / 714;
    public static TextureManager textureMap = new TextureManager(0, 0, 1, "assets\\map.png");

    Map() {
        System.out.println(ONE_PIXEL);
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
            if(i < 9) barDataBase.getBarArray()[i].setTexture(30, 30, 1, "assets\\" + (i + 1) + "-Number-PNG.png");
            //display.getFrame().getComponent(i + 1).;
        }
    }

    private void initBars() {

    }

    public void showMapsOnMap() {

    }
}
