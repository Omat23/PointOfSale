package org.example.Design.SelectStatus.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.SelectStatus.JComponents.JLabelsSelectStatus;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingLabelsSelectStatus implements InitializingElements {

    private JLabelsSelectStatus labelsSelectStatus;
    private List<JLabel> listLabelsSelectStatus;

    public InitializingLabelsSelectStatus() {
        this.labelsSelectStatus = new JLabelsSelectStatus();
        this.listLabelsSelectStatus = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.listLabelsSelectStatus.add(this.labelsSelectStatus.getTitleWindow());
        this.listLabelsSelectStatus.add(this.labelsSelectStatus.getNameAdmin());
        this.listLabelsSelectStatus.add(this.labelsSelectStatus.getNameCustomer());
    }

    public List<JLabel> getListLabelsSelectStatus() {
        return listLabelsSelectStatus;
    }
}
