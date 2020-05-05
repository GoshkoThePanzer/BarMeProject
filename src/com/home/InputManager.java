package com.home;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class InputManager extends JPanel implements ChangeListener {

    private boolean pressed = false;
    private boolean isMouseRealised = false;
    private int mouseReleasedX = 0;
    private int mouseReleasedY = 0;

    InputManager() {
        JButton button = new JButton("");
        button.getModel().addChangeListener(this);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setBounds(0, 0, Display.getWidth(), Display.getHeight());
        Map.display.addComponent(button);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        ButtonModel model = (ButtonModel) e.getSource();
        if (model.isPressed() != pressed) {
            pressed = model.isPressed();
            if (!pressed) isMouseRealised = true;
        }
    }

    public void listener() {
        int x = (int) MouseInfo.getPointerInfo().getLocation().getX() - Map.display.getFrame().getLocation().x - 8;
        int y = (int) MouseInfo.getPointerInfo().getLocation().getY() - Map.display.getFrame().getLocation().y - 30;

        if (pressed) mousePressed(x, y);
        else if (isMouseRealised) mouseRealised(x, y);
    }

    private void mousePressed(int x, int y) {

        if (mouseReleasedX == 0 && mouseReleasedY == 0) {
            mouseReleasedX = x;
            mouseReleasedY = y;
        }

        Map.textureMap.setX(Map.textureMap.getX() + (x - mouseReleasedX));
        Map.textureMap.setY(Map.textureMap.getY() + (y - mouseReleasedY));
        Map.textureMap.render();
        for (int i = 0; i < Map.barDataBase.getBarArray().length; i++) {
            Map.barDataBase.getBarArray()[i].getTexture().setX(Map.barDataBase.getBarArray()[i].getMapX() + (x - mouseReleasedX));
            Map.barDataBase.getBarArray()[i].getTexture().setY(Map.barDataBase.getBarArray()[i].getMapY() + (y - mouseReleasedY));
            Map.barDataBase.getBarArray()[i].getTexture().render();
        }
    }

    private void mouseRealised(int x, int y) {
        mouseReleasedX = x;
        mouseReleasedY = y;
        isMouseRealised = false;
    }

}
