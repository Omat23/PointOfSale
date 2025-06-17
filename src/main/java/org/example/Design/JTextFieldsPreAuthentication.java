package org.example.Design;

import javax.swing.*;

public class JTextFieldsPreAuthentication {

    private JTextField emailUser;
    private JTextField passwordUser;

    public JTextFieldsPreAuthentication() {
        this.emailUser = new JTextField();
        this.passwordUser = new JTextField();
    }

    public JTextField getTextFieldsWindowPreAuthentication(){
        this.emailUser.setLayout(null);
        this.emailUser.setBounds(20,50,100,50);
        this.emailUser.setVisible(true);
        return this.emailUser;
    }
}
