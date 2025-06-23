package org.example.Events;

import org.example.Design.Resources.GenerateImageIconPassword;
import org.example.Resources.GenerateImageIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonRegisterEvent implements ActionListener {

    private JButton showPassword;
    private JPasswordField passwordField;
    private ImageIcon imageIcon;

    public JButtonRegisterEvent(JButton showPassword, JPasswordField passwordField) {
        this.showPassword = showPassword;
        this.passwordField = passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent eventButton) {
        if(eventButton.getActionCommand().equals(this.showPassword.getActionCommand())){
            if(this.passwordField.getEchoChar() == '•') {
                this.passwordField.setEchoChar((char) 0);
                this.showPassword.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIconShow.png"));
            }else{
                this.showPassword.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIcon.png"));
                this.passwordField.setEchoChar('•');
            }
        }
    }
}
