package org.example.Design.LoginDesign.JComponentsLogin;

import javax.swing.*;
import java.awt.*;

public class JTextFieldsPreAuthentication {

    private JTextField emailUser;
    private JPasswordField passwordUser;

    public JTextFieldsPreAuthentication() {
        this.emailUser = new JTextField();
        this.passwordUser = new JPasswordField();
    }

    public JTextField getTextFieldEmailPreAuthentication(){
        this.emailUser.setLayout(null);
        this.emailUser.setBounds(33,150,300,25);
        this.emailUser.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.black));
        this.emailUser.setFont(new Font("Arial", Font.PLAIN, 14));
        this.emailUser.setVisible(true);
        return this.emailUser;
    }

    public JPasswordField getTextFieldPasswordPreAuthentication(){
        this.passwordUser.setLayout(null);
        this.passwordUser.setBounds(33,235,300,25);
        this.passwordUser.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.black));
        this.passwordUser.setFont(new Font("Arial",Font.PLAIN, 14));
        this.passwordUser.setVisible(true);
        return this.passwordUser;
    }


}
