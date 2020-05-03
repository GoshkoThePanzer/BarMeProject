package com.home;

import javax.swing.*;

public class TextureManager extends JComponent {

    int x;
    int y;
    int width;
    int height;
    String path;

    public TextureManager(int x, int y, int width, int height, String path) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.path = path;
    }

    
}
