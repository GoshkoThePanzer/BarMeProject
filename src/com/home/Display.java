package com.home;

import javax.swing.*;
import java.awt.*;

public class Display {

    JFrame frame = new JFrame();
    static int width;
    static int height;

    Display(int widthSize, int heightSize, String name) {
        width = widthSize;
        height = heightSize;

        frame.setSize(widthSize, heightSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle(name);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void addTexture(TextureManager texture) {
        frame.add(texture).setVisible(true);

    }
    public void changePage(Page page) {
        frame.getContentPane().getComponents();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
