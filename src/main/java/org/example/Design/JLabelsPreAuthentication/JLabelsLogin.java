package org.example.Design.JLabelsPreAuthentication;

import javax.swing.*;
import java.awt.*;

public class JLabelsLogin {

    private final JLabel tittleWindowPreAuthentication;
    private final JLabel emailPreAuthentication;
    private final JLabel passwordPreAuthentication;

    public JLabelsLogin() {
        this.tittleWindowPreAuthentication = new JLabel();
        this.emailPreAuthentication = new JLabel();
        this.passwordPreAuthentication = new JLabel();
    }

    public JLabel getTittleWindowPreAuthentication(){
        this.tittleWindowPreAuthentication.setLayout(null);
        this.tittleWindowPreAuthentication.setText("Login");
        this.tittleWindowPreAuthentication.setFont(new Font("Arial", Font.BOLD, 60));
        this.tittleWindowPreAuthentication.setBounds(95,5,200,90);
        this.tittleWindowPreAuthentication.setVisible(true);
        return this.tittleWindowPreAuthentication;
    }

    public JLabel getLabelEmailPreAuthentication(){
        this.emailPreAuthentication.setLayout(null);
        this.emailPreAuthentication.setText("Email: ");
        this.emailPreAuthentication.setFont(new Font("Arial", Font.BOLD, 16));
        this.emailPreAuthentication.setBounds(25,100,200,90);
        this.emailPreAuthentication.setVisible(true);
        return this.emailPreAuthentication;
    }

    public JLabel getLabelPasswordPreAuthentication(){
        this.passwordPreAuthentication.setLayout(null);
        this.passwordPreAuthentication.setText("Password: ");
        this.passwordPreAuthentication.setFont(new Font("Arial", Font.BOLD, 16));
        this.passwordPreAuthentication.setBounds(25,200,200,90);
        this.passwordPreAuthentication.setVisible(true);
        return this.passwordPreAuthentication;
    }
}
