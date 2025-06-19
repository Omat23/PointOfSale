package org.example.Design.LoginDesign.JComponentsLogin;

import javax.swing.*;
import java.awt.*;

public class JButtonLogin {

    private JButton submitLogin;
    private JButton linkRegister;

    public JButtonLogin() {
        this.submitLogin = new JButton();
        this.linkRegister = new JButton();
    }

    public JButton getJButtonSubmitLogin(){
        this.submitLogin.setLayout(null);
        this.submitLogin.setText("SUBMIT");
        this.submitLogin.setBounds(127, 285, 110,40);
        this.submitLogin.setBackground(Color.decode("#227ffe"));
        this.submitLogin.setForeground(Color.WHITE);
        this.submitLogin.setVisible(true);
        return this.submitLogin;
    }

    public JButton getJButtonLinkNotAccount(){
        this.linkRegister.setLayout(null);
        this.linkRegister.setText("Do you not have account with us?");
        this.linkRegister.setBorder(BorderFactory.createMatteBorder(0,0,0,0, Color.WHITE));
        this.linkRegister.setBounds(30, 345, 300,25);
        this.linkRegister.setForeground(Color.decode("#358bff"));
        this.linkRegister.setBackground(Color.white);
        this.linkRegister.setVisible(true);
        return this.linkRegister;
    }
}
