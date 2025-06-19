package org.example.Design.LoginDesign.InitializingElements;

import org.example.Design.LoginDesign.InitializingElements.Interfaces.InitializingElements;
import org.example.Design.LoginDesign.JComponentsLogin.JButtonLogin;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJButtonsLogin implements InitializingElements {

    private JButtonLogin jButtonLogin;
    private List<JButton> listButtons;

    public InitializingJButtonsLogin() {
        this.jButtonLogin = new JButtonLogin();
        this.listButtons = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.listButtons.add(this.jButtonLogin.getJButtonSubmitLogin());
        this.listButtons.add(this.jButtonLogin.getJButtonLinkNotAccount());
    }

    public List<JButton> getListButtons() {
        return listButtons;
    }
}
