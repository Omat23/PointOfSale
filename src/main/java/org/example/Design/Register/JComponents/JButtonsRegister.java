package org.example.Design.Register.JComponents;

import javax.swing.*;
import java.awt.*;

public class JButtonsRegister {

    private JButton registerButton;

    public JButtonsRegister() {
        this.registerButton = new JButton();
    }

    public JButton getRegisterButton() {
        this.registerButton.setLayout(null);
        this.registerButton.setText("REGISTER");
        this.registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        this.registerButton.setBackground(Color.decode("#227ffe"));
        this.registerButton.setForeground(Color.WHITE);
        this.registerButton.setBounds(150, 470, 120, 35);
        return registerButton;
    }
}
