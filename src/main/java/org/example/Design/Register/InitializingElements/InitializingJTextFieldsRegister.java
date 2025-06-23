package org.example.Design.Register.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.Register.JComponents.JTextFieldsRegister;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJTextFieldsRegister implements InitializingElements {

    private JTextFieldsRegister jTextFieldRegister;
    private List<JTextField> textFieldList;

    public InitializingJTextFieldsRegister(JTextFieldsRegister jTextField) {
        this.jTextFieldRegister = jTextField;
        this.textFieldList = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.textFieldList.add(this.jTextFieldRegister.getFieldNameRegister());
        this.textFieldList.add(this.jTextFieldRegister.getFieldSurnameRegister());
        this.textFieldList.add(this.jTextFieldRegister.getFieldAgeRegister());
        this.textFieldList.add(this.jTextFieldRegister.getFieldEmailRegister());
        this.textFieldList.add(this.jTextFieldRegister.getFieldPasswordRegister());
    }

    public List<JTextField> getTextFieldList() {
        return textFieldList;
    }
}
