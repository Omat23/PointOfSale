package org.example.Design;

import javax.swing.*;
import java.awt.*;

public class JLabelTitlePreAuthentication {

    private final JLabel tittleWindowPreAuthentication;

    public JLabelTitlePreAuthentication() {
        this.tittleWindowPreAuthentication = new JLabel();
    }

    public JLabel getTittleWindowPreAuthentication(){
        this.tittleWindowPreAuthentication.setLayout(null);
        this.tittleWindowPreAuthentication.setText("Login");
        this.tittleWindowPreAuthentication.setFont(new Font("Arial", Font.BOLD, 60));
        this.tittleWindowPreAuthentication.setBounds(115,20,200,90);
        this.tittleWindowPreAuthentication.setVisible(true);
        return this.tittleWindowPreAuthentication;
    }
}
