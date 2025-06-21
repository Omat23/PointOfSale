package org.example.Design.Register.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.Register.JComponents.JLabelsRegister;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingJLabelsRegister implements InitializingElements {

    private JLabelsRegister jLabelsRegister;
    private List<JLabel> labelsRegister;

    public InitializingJLabelsRegister() {
        this.jLabelsRegister =  new JLabelsRegister();
        this.labelsRegister = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents(){
        this.labelsRegister.add(this.jLabelsRegister.getTitleRegister());
        this.labelsRegister.add(this.jLabelsRegister.getLabelNameRegister());
        this.labelsRegister.add(this.jLabelsRegister.getLabelSurnameRegister());
        this.labelsRegister.add(this.jLabelsRegister.getLabelAgeRegister());
        this.labelsRegister.add(this.jLabelsRegister.getLabelEmailRegister());
        this.labelsRegister.add(this.jLabelsRegister.getLabelPasswordRegister());
    }

    public List<JLabel> getLabelsRegister() {
        return labelsRegister;
    }
}
