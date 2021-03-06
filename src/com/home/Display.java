package com.home;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame = new JFrame();
    private static int width;
    private static int height;

    Display(int widthSize, int heightSize, String name) {
        width = widthSize;
        height = heightSize;

        frame.setSize(widthSize, heightSize);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle(name);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void addTexture(TextureManager texture) {
        frame.add(texture).repaint();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    public void addComponent(JComponent component) {
        frame.getContentPane().add(component);
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
