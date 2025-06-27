package org.example.Design.SelectStatus.JComponents;

import org.example.Design.SelectStatus.Images.GenerateImageIconSelectStatus;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class JButtonsSelectStatus {

    private JButton adminUserButton;
    private JButton customerUserButton;

    public JButtonsSelectStatus() {
        this.adminUserButton = new JButton(GenerateImageIconSelectStatus.getImageIconSelectStatus("AdminUserIcon.png"));
        this.customerUserButton = new JButton(GenerateImageIconSelectStatus.getImageIconSelectStatus("CustomerUserIcon.png"));
    }

    public JButton getAdminUserButton() {
        this.adminUserButton.setLayout(null);
        this.adminUserButton.setBounds(50,100,150,150);
        this.adminUserButton.setBorder(new MatteBorder(0,0,0,0, Color.WHITE));
        this.adminUserButton.setBackground(Color.white);
        this.adminUserButton.setVisible(true);
        return adminUserButton;
    }

    public JButton getCustomerUserButton() {
        this.customerUserButton.setLayout(null);
        this.customerUserButton.setBounds(230,100,150,150);
        this.customerUserButton.setBorder(new MatteBorder(0,0,0,0, Color.WHITE));
        this.customerUserButton.setBackground(Color.white);
        this.customerUserButton.setVisible(true);
        return customerUserButton;
    }
}
