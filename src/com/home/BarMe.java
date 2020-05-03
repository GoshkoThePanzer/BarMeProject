package com.home;

import javax.swing.*;
import java.awt.*;

public class BarMe {

    Display display = new Display(600, 600, "BarMe");
    Page firstPage = new Page();

    BarMe(){
        init();
    }

    public void init() {
        firstPage.addButton(250, 250, 100, 100, "home");
        firstPage.addButton(300, 300, 30, 300, "smth");
        firstPage.addGraphic(new TextureManager(80,80,300,
                300, "D:\\CourseJavaProjects\\Bar Me\\assets\\sprite1.png"));
        firstPage.addGraphic(new TextureManager(100,100,50,
                50, "D:\\CourseJavaProjects\\Bar Me\\assets\\sprite2.png"));

        display.addPage(firstPage);

        //firstPage.removeGraphic();
    }

}
