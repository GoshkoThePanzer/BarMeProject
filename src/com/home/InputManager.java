package com.home;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class InputManager extends JPanel implements ChangeListener {

    private boolean pressed = false;
    private boolean isMouseRealised = false;

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
}
