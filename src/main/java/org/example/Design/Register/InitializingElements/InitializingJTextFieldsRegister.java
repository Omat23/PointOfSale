package org.example.Design.Register.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.Register.JComponents.JTextFieldsRegister;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJTextFieldsRegister implements InitializingElements {

    private JTextFieldsRegister jTextFieldsRegister;
    private List<JTextField> textFieldList;

    public InitializingJTextFieldsRegister() {
        this.jTextFieldsRegister = new JTextFieldsRegister();
        this.textFieldList = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.textFieldList.add(this.jTextFieldsRegister.getFieldNameRegister());
        this.textFieldList.add(this.jTextFieldsRegister.getFieldSurnameRegister());
        this.textFieldList.add(this.jTextFieldsRegister.getFieldAgeRegister());
        this.textFieldList.add(this.jTextFieldsRegister.getFieldEmailRegister());
        this.textFieldList.add(this.jTextFieldsRegister.getFieldPasswordRegister());
    }

    public List<JTextField> getTextFieldList() {
        return textFieldList;
    }
}
