package org.example.Design.Register.JComponents;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class JTextFieldsRegister {

    private JTextField fieldNameRegister;
    private JTextField fieldSurnameRegister;
    private JTextField fieldAgeRegister;
    private JTextField fieldEmailRegister;
    private JPasswordField fieldPasswordRegister;

    public JTextFieldsRegister() {
        this.fieldNameRegister = new JTextField();
        this.fieldSurnameRegister = new JTextField();
        this.fieldAgeRegister = new JTextField();
        this.fieldEmailRegister = new JTextField();
        this.fieldPasswordRegister = new JPasswordField();
    }

    public JTextField getFieldNameRegister(){
        this.fieldNameRegister.setLayout(null);
        this.fieldNameRegister.setBounds(37, 143,350,25);
        this.fieldNameRegister.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        this.fieldNameRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        this.fieldNameRegister.setVisible(true);
        return this.fieldNameRegister;
    }

    public JTextField getFieldSurnameRegister(){
        this.fieldSurnameRegister.setLayout(null);
        this.fieldSurnameRegister.setBounds(37, 220,350,25);
        this.fieldSurnameRegister.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        this.fieldSurnameRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        this.fieldSurnameRegister.setVisible(true);
        return this.fieldSurnameRegister;
    }

    public JTextField getFieldAgeRegister(){
        this.fieldAgeRegister.setLayout(null);
        this.fieldAgeRegister.setBounds(72, 267,40,25);
        this.fieldAgeRegister.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        this.fieldAgeRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        this.fieldAgeRegister.setHorizontalAlignment(JTextField.CENTER);
        this.fieldAgeRegister.setVisible(true);
        return this.fieldAgeRegister;
    }

    public JTextField getFieldEmailRegister(){
        this.fieldEmailRegister.setLayout(null);
        this.fieldEmailRegister.setBounds(37, 343,350,25);
        this.fieldEmailRegister.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        this.fieldEmailRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        this.fieldEmailRegister.setVisible(true);
        return this.fieldEmailRegister;
    }

    public JPasswordField getFieldPasswordRegister(){
        this.fieldPasswordRegister.setLayout(null);
        this.fieldPasswordRegister.setBounds(37, 417,350,25);
        this.fieldPasswordRegister.setBorder(new MatteBorder(0,0,1,0, Color.BLACK));
        this.fieldPasswordRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        this.fieldPasswordRegister.setVisible(true);
        return this.fieldPasswordRegister;
    }
}
