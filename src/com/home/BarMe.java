package com.home;

public class BarMe {

    Display display = new Display(600, 600, "BarMe");
    Page firstPage = new Page(Display.width, Display.height);

    BarMe(){
        init();
    }

    public void init() {
        firstPage.addGraphic(new TextureManager(80,80,50,
                50, "D:\\CourseJavaProjects\\Bar Me\\assets\\sprite1.png"));
        firstPage.addGraphic(new TextureManager(0,0,50,
                50, "D:\\CourseJavaProjects\\Bar Me\\assets\\sprite2.png"));
        display.addPage(firstPage);
        firstPage.showGraphics();
        //firstPage.removeGraphic();
    }

}
