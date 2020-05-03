package com.home;

import javax.swing.*;

public class Display {

    JFrame frame = new JFrame();
    int width;
    int height;

    Display(int widthSize, int heightSize, String name) {
        this.width = widthSize;
        this.height = heightSize;

        frame.setSize(widthSize, heightSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle(name);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
