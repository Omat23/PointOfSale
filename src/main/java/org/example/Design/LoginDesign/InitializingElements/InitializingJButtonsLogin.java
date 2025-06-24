package org.example.Design.LoginDesign.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.LoginDesign.JComponentsLogin.JButtonLogin;
import org.example.Design.LoginDesign.JFrameLogin;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJButtonsLogin implements InitializingElements {

    private JButtonLogin jButtonLogin;
    private List<JButton> listButtons;

    public InitializingJButtonsLogin(JFrameLogin windowLogin) {
        this.jButtonLogin = new JButtonLogin(windowLogin);
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
