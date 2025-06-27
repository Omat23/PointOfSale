package org.example.Design.SelectStatus.InitializingElements;

import org.example.Design.Interfaces.InitializingElements;
import org.example.Design.SelectStatus.JComponents.JButtonsSelectStatus;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InitializingButtonsSelectStatus implements InitializingElements{

    private JButtonsSelectStatus jButtonsSelectStatus;
    private List<JButton> listButtonsSelectStatus;

    public InitializingButtonsSelectStatus() {
        this.jButtonsSelectStatus = new JButtonsSelectStatus();
        this.listButtonsSelectStatus = new ArrayList<>();
        initializingComponents();
    }

    @Override
    public void initializingComponents() {
        this.listButtonsSelectStatus.add(this.jButtonsSelectStatus.getAdminUserButton());
        this.listButtonsSelectStatus.add(this.jButtonsSelectStatus.getCustomerUserButton());
    }

    public List<JButton> getListButtonsSelectStatus() {
        return listButtonsSelectStatus;
    }
}
