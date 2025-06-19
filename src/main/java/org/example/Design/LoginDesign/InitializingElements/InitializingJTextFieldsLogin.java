package org.example.Design.LoginDesign.InitializingElements;

import org.example.Design.LoginDesign.InitializingElements.Interfaces.InitializingElements;
import org.example.Design.LoginDesign.JComponentsLogin.JTextFieldsPreAuthentication;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJTextFieldsLogin implements InitializingElements {

    private JTextFieldsPreAuthentication jTextFieldsPreAuthentication;
    private List<JTextField> jTextFieldsLogin;

    public InitializingJTextFieldsLogin() {
        this.jTextFieldsPreAuthentication = new JTextFieldsPreAuthentication();
        this.jTextFieldsLogin = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.jTextFieldsLogin.add(this.jTextFieldsPreAuthentication.getTextFieldEmailPreAuthentication());
        this.jTextFieldsLogin.add(this.jTextFieldsPreAuthentication.getTextFieldPasswordPreAuthentication());
    }

    public List<JTextField> getJTextFieldsLogin() {
        return jTextFieldsLogin;
    }
}
