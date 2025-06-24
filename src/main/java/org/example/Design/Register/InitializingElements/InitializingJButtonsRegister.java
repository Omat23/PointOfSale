package org.example.Design.Register.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.Register.JComponents.JButtonsRegister;
import org.example.Design.Register.JFrameRegister;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJButtonsRegister implements InitializingElements {

    private JButtonsRegister jButtonsRegister;
    private List<JButton> buttonsRegisterList;

    public InitializingJButtonsRegister(JPasswordField jPasswordField, JFrameRegister windowRegister) {
        this.jButtonsRegister = new JButtonsRegister(jPasswordField, windowRegister);
        this.buttonsRegisterList = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.buttonsRegisterList.add(jButtonsRegister.getRegisterButton());
        this.buttonsRegisterList.add(jButtonsRegister.getJButtonShowPassword());
        this.buttonsRegisterList.add(jButtonsRegister.getButtonBackLogin());
    }

    public List<JButton> getButtonsRegisterList() {
        return buttonsRegisterList;
    }
}
