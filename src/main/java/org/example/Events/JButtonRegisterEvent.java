package org.example.Events;

import org.example.Design.Resources.GenerateImageIconPassword;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonRegisterEvent implements ActionListener {

    private JButton showPassword;
    private JPasswordField passwordField;

    public JButtonRegisterEvent(JButton showPassword, JPasswordField passwordField) {
        this.showPassword = showPassword;
        this.passwordField = passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent eventButton) {
        if(eventButton.getActionCommand().equals(this.showPassword.getActionCommand())){
            if(this.passwordField.getEchoChar() == '•') {
                this.passwordField.setEchoChar((char) 0);
                this.showPassword.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIconShow.png", 50,50));
            }else{
                this.showPassword.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIcon.png", 68, 50));
                this.passwordField.setEchoChar('•');
            }
        }
    }
}
