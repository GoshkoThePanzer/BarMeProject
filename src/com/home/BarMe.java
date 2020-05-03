package com.home;

import javax.swing.*;
import java.awt.*;

public class BarMe {

    Display display = new Display(600, 600, "BarMe");
    Page allBars;
    Page mainPage;
    Page openBars;
    Page mapOfBars;

    BarMe(){
        init();
    }

    public void init() {
        initMainPage();
    }

    private void initAllBarsPage() {
        allBars = new Page();
    }
    private void initMainPage() {
        mainPage = new Page();
        mainPage.addButton(150, 50, 300, 145, "Show All Bars",
                new Thread(() -> display.addPage(allBars)));
        mainPage.addButton(150, 215, 300, 145, "MapOfBars",
                new Thread(() -> display.addPage(mapOfBars)));
        mainPage.addButton(150, 380, 300, 145, "Show Open Bars",
                new Thread(() -> display.addPage(openBars)));
        //mainPage.addGraphic(new TextureManager(0,0,600,));
        display.addPage(mainPage);
    }
    private void initOpenBarsPage() {
        openBars = new Page();
    }
    private void initMapOfBarsPage() {
        mapOfBars = new Page();
    }

}
