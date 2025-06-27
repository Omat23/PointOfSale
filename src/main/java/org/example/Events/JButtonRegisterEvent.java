package org.example.Events;

import org.example.Design.LoginDesign.JFrameLogin;
import org.example.Design.Register.JFrameRegister;
import org.example.Design.Register.Resources.GenerateImageIconPassword;
import org.example.Design.SelectStatus.JFrameSelectStatus;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonRegisterEvent implements ActionListener {

    private JButton buttonShowPasswordFromRegister;
    private JButton buttonLoginComeBack;
    private JButton buttonRegisterUser;
    private JFrameRegister windowRegister;

    private static JFrameLogin frameWindowLogin;
    private static JPasswordField passwordField;

    public JButtonRegisterEvent(JButton buttonShowPasswordRegister, JButton buttonLoginComeBack, JFrameRegister windowRegister, JButton buttonRegisterUser) {
        this.buttonShowPasswordFromRegister = buttonShowPasswordRegister;
        this.buttonLoginComeBack = buttonLoginComeBack;
        this.windowRegister = windowRegister;
        this.buttonRegisterUser = buttonRegisterUser;
    }

    @Override
    public void actionPerformed(ActionEvent eventButton) {
        if(eventButton.getActionCommand().equals(this.buttonShowPasswordFromRegister.getActionCommand())){
            if(passwordField.getEchoChar() == '•') {
                passwordField.setEchoChar((char) 0);
                this.buttonShowPasswordFromRegister.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIconShow.png", 50,50));
            }else{
                this.buttonShowPasswordFromRegister.setIcon(GenerateImageIconPassword.generateImageIcon("PasswordIcon.png", 68, 50));
                passwordField.setEchoChar('•');
            }
        }

        if(eventButton.getActionCommand().equals(this.buttonLoginComeBack.getActionCommand())){
            frameWindowLogin.setVisible(true);
            JButtonLoginEvent.setJFrameRegister(this.windowRegister);
            this.windowRegister.setVisible(false);
        }

        if(eventButton.getActionCommand().equals(this.buttonRegisterUser.getActionCommand())){
            this.windowRegister.setVisible(false);
            new JFrameSelectStatus();
        }
    }

    public static void setWindowLogin(JFrameLogin windowLogin) {
        frameWindowLogin = windowLogin;
    }

    public static void initializingJPasswordField(JPasswordField buttonShowPassword){
        passwordField = buttonShowPassword;
    }
}
