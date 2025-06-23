package org.example.Design.Register.JComponents;

import org.example.Design.Resources.GenerateImageIconPassword;
import org.example.Events.JButtonRegisterEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class JButtonsRegister {

    private JButton registerButton;
    private JButton showPassword;
    private JPasswordField passwordField;

    public JButtonsRegister(JPasswordField passwordField) {
        this.registerButton = new JButton();
        this.showPassword = new JButton(GenerateImageIconPassword.generateImageIcon("PasswordIcon.png"));
        this.passwordField = passwordField;
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

    public JButton getJButtonShowPassword(){
        this.showPassword.setLayout(null);
        this.showPassword.setBounds(325, 382, 50,40);
        this.showPassword.setBackground(Color.WHITE);
        this.showPassword.setBorder(new MatteBorder(0,0,0,0,Color.WHITE));
        this.showPassword.addActionListener(new JButtonRegisterEvent(this.showPassword, this.passwordField));
        this.showPassword.setVisible(true);
        return this.showPassword;
    }
}
