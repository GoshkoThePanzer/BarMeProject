package com.home;
import javax.swing.*;

public class Page extends JPanel {

    int width;
    int height;

    Page(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addGraphic(TextureManager texture) {
        this.add(texture);
    }

    public void removeGraphic(TextureManager texture) {
        this.remove(texture);
    }

    public void addButton(JButton btn) {
        this.add(btn);
    }

}
