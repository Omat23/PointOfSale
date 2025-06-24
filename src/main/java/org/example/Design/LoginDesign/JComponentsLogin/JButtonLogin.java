package org.example.Design.LoginDesign.JComponentsLogin;

import org.example.Design.LoginDesign.JFrameLogin;
import org.example.Events.JButtonLoginEvent;
import org.example.Resources.GenerateImageIcon;

import javax.swing.*;
import java.awt.*;

public class JButtonLogin {

    private JButton submitLogin;
    private JButton linkRegister;
    private JFrameLogin windowLogin;

    public JButtonLogin(JFrameLogin windowLogin) {
        this.submitLogin = new JButton();
        this.linkRegister = new JButton();
        this.windowLogin = windowLogin;
        sentElementsToEvent();
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
        this.linkRegister.setBounds(30, 335, 300,25);
        this.linkRegister.setForeground(Color.decode("#358bff"));
        this.linkRegister.setBackground(Color.white);
        this.linkRegister.setVisible(true);
        return this.linkRegister;
    }

    public void sentElementsToEvent(){
        JButtonLoginEvent jButtonLoginEvent = new JButtonLoginEvent(this.linkRegister, this.windowLogin);
        this.linkRegister.addActionListener(jButtonLoginEvent);
    }
}
