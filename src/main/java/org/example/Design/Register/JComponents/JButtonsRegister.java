package org.example.Design.Register.JComponents;

import org.example.Design.Register.JFrameRegister;
import org.example.Design.Resources.GenerateImageIconPassword;
import org.example.Events.JButtonRegisterEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class JButtonsRegister {

    private JButton registerButton;
    private JButton showPassword;
    private JPasswordField passwordField;
    private JButton buttonBackLogin;
    private JFrameRegister windowRegister;

    public JButtonsRegister(JPasswordField passwordField, JFrameRegister windowRegister) {
        this.registerButton = new JButton();
        this.showPassword = new JButton(GenerateImageIconPassword.generateImageIcon("PasswordIcon.png", 68, 50));
        this.passwordField = passwordField;
        this.buttonBackLogin = new JButton();
        this.windowRegister = windowRegister;

        //Se envian los botones una vez ya inicilizados
        sentElementsToEvent();
    }

    public JButton getRegisterButton() {
        this.registerButton.setLayout(null);
        this.registerButton.setText("REGISTER");
        this.registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        this.registerButton.setBackground(Color.decode("#227ffe"));
        this.registerButton.setForeground(Color.WHITE);
        this.registerButton.setBounds(150, 458, 120, 35);
        return registerButton;
    }

    public JButton getJButtonShowPassword(){
        this.showPassword.setLayout(null);
        this.showPassword.setBounds(325, 380, 50,40);
        this.showPassword.setBackground(Color.WHITE);
        this.showPassword.setBorder(new MatteBorder(0,0,0,0,Color.WHITE));
        JButtonRegisterEvent.initializingJPasswordField(this.passwordField);
        this.showPassword.setVisible(true);
        return this.showPassword;
    }

    public JButton getButtonBackLogin(){
        this.buttonBackLogin.setLayout(null);
        this.buttonBackLogin.setText("Do you have an account with us?");
        this.buttonBackLogin.setBounds(58, 495, 300, 20);
        this.buttonBackLogin.setBorder(new MatteBorder(0,0,0,0, Color.WHITE));
        this.buttonBackLogin.setBackground(Color.WHITE);
        this.buttonBackLogin.setForeground(Color.decode("#227ffe"));
        this.buttonBackLogin.setVisible(true);
        return this.buttonBackLogin;
    }

    public void sentElementsToEvent(){
        JButtonRegisterEvent jButtonRegisterEvent = new JButtonRegisterEvent(this.showPassword, this.buttonBackLogin, this.windowRegister);
        this.showPassword.addActionListener(jButtonRegisterEvent);
        this.buttonBackLogin.addActionListener(jButtonRegisterEvent);
    }

}
