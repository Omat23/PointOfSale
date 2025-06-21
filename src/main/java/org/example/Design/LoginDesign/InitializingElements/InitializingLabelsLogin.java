package org.example.Design.LoginDesign.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.LoginDesign.JComponentsLogin.JLabelsLogin;

import javax.swing.*;
import java.util.*;

public class InitializingLabelsLogin implements InitializingElements {

    private JLabelsLogin jLabelsLogin;
    List<JLabel> labelsLogin;

    public InitializingLabelsLogin() {
        this.jLabelsLogin = new JLabelsLogin();
        this.labelsLogin = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.labelsLogin.add(this.jLabelsLogin.getTittleWindowPreAuthentication());
        this.labelsLogin.add(this.jLabelsLogin.getLabelEmailPreAuthentication());
        this.labelsLogin.add(this.jLabelsLogin.getLabelPasswordPreAuthentication());
    }

    public List<JLabel> getListLabelsLogin() {
        return this.labelsLogin;
    }
}
