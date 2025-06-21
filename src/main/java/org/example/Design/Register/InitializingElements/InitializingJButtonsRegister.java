package org.example.Design.Register.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.Register.JComponents.JButtonsRegister;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJButtonsRegister implements InitializingElements {

    private JButtonsRegister jButtonsRegister;
    private List<JButton> buttonsRegisterList;

    public InitializingJButtonsRegister() {
        this.jButtonsRegister = new JButtonsRegister();
        this.buttonsRegisterList = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.buttonsRegisterList.add(jButtonsRegister.getRegisterButton());
    }

    public List<JButton> getButtonsRegisterList() {
        return buttonsRegisterList;
    }
}
