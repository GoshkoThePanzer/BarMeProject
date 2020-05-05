package com.home;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class InputManager extends JPanel implements ChangeListener {

    private boolean pressed = false;
    private boolean isMouseRealised = false;

    @Override
    public void stateChanged(ChangeEvent e) {
        ButtonModel model = (ButtonModel) e.getSource();
        if (model.isPressed() != pressed) {
            pressed = model.isPressed();
            if (!pressed) isMouseRealised = true;
        }
    }
}
