package org.example.Design.Register.JComponents;

import javax.swing.*;
import java.awt.*;

public class JLabelsRegister {

    private JLabel titleRegister;

    public JLabelsRegister() {
        this.titleRegister = new JLabel();
    }

    public JLabel getTitleRegister() {
        this.titleRegister.setLayout(null);
        this.titleRegister.setText("Register");
        this.titleRegister.setFont(new Font("Arial", Font.BOLD, 60));
        this.titleRegister.setBounds(95,5,250,90);
        this.titleRegister.setVisible(true);
        return this.titleRegister;
    }
}
