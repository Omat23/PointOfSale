package org.example.Events;

import org.example.Design.LoginDesign.JFrameLogin;
import org.example.Design.Register.JFrameRegister;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonLoginEvent implements ActionListener {

    private JButton buttonFromLogin;
    private JFrameLogin windowLogin;
    private static JFrameRegister jFrameRegisterWindow;

    public JButtonLoginEvent(JButton buttonFromLogin, JFrameLogin windowLogin) {
        this.buttonFromLogin = buttonFromLogin;
        this.windowLogin = windowLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(this.buttonFromLogin.getActionCommand())){

           if(jFrameRegisterWindow == null){
               jFrameRegisterWindow = new JFrameRegister();
               JButtonRegisterEvent.setWindowLogin(this.windowLogin);
               this.windowLogin.setVisible(false);
           }
           jFrameRegisterWindow.setVisible(true);
            this.windowLogin.setVisible(false);
        }
    }

    public static void setJFrameRegister(JFrameRegister jFrameRegister){
        jFrameRegisterWindow = jFrameRegister;
    }
}
