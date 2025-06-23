package org.example.Events;

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
            }else{
                this.passwordField.setEchoChar('•');
            }
        }
    }
}
