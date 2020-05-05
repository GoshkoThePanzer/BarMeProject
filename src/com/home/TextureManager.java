package com.home;

import javax.swing.*;
import java.awt.*;

public class TextureManager extends JComponent {

    private int x;
    private int y;
    int width;
    int height;
    static int scale;
    String path;

    public TextureManager() {}

    public TextureManager(int x, int y, int width, int height, int scale, String path) {
        this.x = x;
        this.y = y;
        this.width = width * scale;
        this.height = height * scale;
        this.path = path;
        scale = 1;
    }

    public TextureManager(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.width = 0;
        this.height = 0;
        this.path = path;
        scale = 0;
    }

    public TextureManager(int x, int y,int scale, String path) {
        this.x = x;
        this.y = y;
        this.width = 0;
        this.height = 0;
        this.path = path;
        TextureManager.scale = scale;
    }


    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D) g;

        ImageIcon imageIcon = new ImageIcon(this.path);
        Image image = imageIcon.getImage();

        if(this.width == 0 && this.height == 0) {
            this.width = image.getWidth(null) * scale;
            this.height = image.getHeight(null) * scale;
        }

        graph.drawImage(image, this.x, this.y, this.width, this.height, null);
    }

    public void render() {
        Thread animationThread = new Thread(this::repaint);

        animationThread.start();
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }
}
