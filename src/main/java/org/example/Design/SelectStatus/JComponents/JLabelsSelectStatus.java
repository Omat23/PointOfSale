package org.example.Design.SelectStatus.JComponents;

import javax.swing.*;
import java.awt.*;

public class JLabelsSelectStatus {

    private JLabel titleWindow;
    private JLabel nameAdmin;
    private JLabel nameCustomer;

    public JLabelsSelectStatus() {
        this.titleWindow = new JLabel();
        this.nameAdmin = new JLabel();
        this.nameCustomer = new JLabel();
    }

    public JLabel getTitleWindow(){
        this.titleWindow.setLayout(null);
        this.titleWindow.setText("Choose a type user");
        this.titleWindow.setFont(new Font("Arial", Font.BOLD, 24));
        this.titleWindow.setBounds(98,20, 230,50);
        this.titleWindow.setVisible(true);
        return this.titleWindow;
    }

    public JLabel getNameAdmin() {
        this.nameAdmin.setLayout(null);
        this.nameAdmin.setText("Admin");
        this.nameAdmin.setFont(new Font("Arial", Font.BOLD, 18));
        this.nameAdmin.setBounds(98, 250, 80,50);
        this.nameAdmin.setVisible(true);
        return nameAdmin;
    }

    public JLabel getNameCustomer() {
        this.nameCustomer.setLayout(null);
        this.nameCustomer.setText("Customer");
        this.nameCustomer.setFont(new Font("Arial", Font.BOLD, 18));
        this.nameCustomer.setBounds(262, 250, 120,50);
        this.nameCustomer.setVisible(true);
        return nameCustomer;
    }
}
