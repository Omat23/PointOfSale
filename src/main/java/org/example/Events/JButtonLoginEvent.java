package org.example.Events;

import org.example.Design.Register.JFrameRegister;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonLoginEvent implements ActionListener {

    private JButton buttonFromLogin;

    public JButtonLoginEvent(JButton buttonFromLogin) {
        this.buttonFromLogin = buttonFromLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(this.buttonFromLogin.getActionCommand())){
            new JFrameRegister();
        }
    }
}
