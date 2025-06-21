package org.example.Design.Register.JComponents;

import javax.swing.*;
import java.awt.*;

public class JLabelsRegister {

    private JLabel titleRegister;
    private JLabel nameRegister;
    private JLabel surnameRegister;
    private JLabel ageRegister;
    private JLabel emailRegister;
    private JLabel passwordRegister;

    public JLabelsRegister() {
        this.titleRegister = new JLabel();
        this.nameRegister = new JLabel();
        this.surnameRegister = new JLabel();
        this.ageRegister = new JLabel();
        this.emailRegister = new JLabel();
        this.passwordRegister = new JLabel();
    }

    public JLabel getTitleRegister() {
        this.titleRegister.setLayout(null);
        this.titleRegister.setText("Register");
        this.titleRegister.setFont(new Font("Arial", Font.BOLD, 60));
        this.titleRegister.setBounds(95,5,250,90);
        this.titleRegister.setVisible(true);
        return this.titleRegister;
    }

    public JLabel getLabelNameRegister(){
        this.nameRegister.setLayout(null);
        this.nameRegister.setText("Name:");
        this.nameRegister.setFont(new Font("Arial", Font.BOLD, 16));
        this.nameRegister.setBounds(25, 100, 60, 50);
        this.nameRegister.setVisible(true);
        return this.nameRegister;
    }

    public JLabel getLabelSurnameRegister(){
        this.surnameRegister.setLayout(null);
        this.surnameRegister.setText("Surname:");
        this.surnameRegister.setFont(new Font("Arial", Font.BOLD, 16));
        this.surnameRegister.setBounds(25, 180, 100, 50);
        this.surnameRegister.setVisible(true);
        return this.surnameRegister;
    }

    public JLabel getLabelAgeRegister(){
        this.ageRegister.setVisible(true);
        this.ageRegister.setText("Age:");
        this.ageRegister.setFont(new Font("Arial", Font.BOLD, 16));
        this.ageRegister.setBounds(25, 255, 40,50);
        this.ageRegister.setVisible(true);
        return this.ageRegister;
    }

    public JLabel getLabelEmailRegister(){
        this.emailRegister.setLayout(null);
        this.emailRegister.setText("Email:");
        this.emailRegister.setFont(new Font("Arial", Font.BOLD, 16));
        this.emailRegister.setBounds(25, 303, 100, 50);
        this.emailRegister.setVisible(true);
        return this.emailRegister;
    }

    public JLabel getLabelPasswordRegister(){
        this.passwordRegister.setLayout(null);
        this.passwordRegister.setText("Password: (Min 8 characters)");
        this.passwordRegister.setFont(new Font("Arial", Font.BOLD, 16));
        this.passwordRegister.setBounds(25, 377, 250, 50);
        this.passwordRegister.setVisible(true);
        return this.passwordRegister;
    }
}
