package com.home;

import javax.swing.*;
import java.awt.*;

public class BarMe {

    Display display;

    BarMe(){
        init();
    }

    public void init() {
        new Display(600, 600, "BarMe");

    }

}
