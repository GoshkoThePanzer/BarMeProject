package com.home;

import javax.swing.*;

import java.awt.*;
import java.util.Vector;

public class Page {

    Vector<JComponent> components = new Vector<>();

    Page() {
    }

    public void addGraphic(TextureManager texture) {
        components.add(texture);
    }

    public int getComponentsNumber() {
        return components.size();
    }

    public JComponent getSpecificComponent(int i) {
        return components.get(i);
    }

    public void removeGraphic(/*TextureManager texture*/) {

    }

    public void addButton(int x, int y, int width, int height, String name, Thread tread) {
        JButton btn = new JButton(name);
        btn.addActionListener(e -> tread.start());
        btn.setBounds(x, y, width, height);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        panel.add(btn);
        components.add(panel);
    }

    public void addPanel(JPanel panel) {
        components.add(panel);
    }

}
