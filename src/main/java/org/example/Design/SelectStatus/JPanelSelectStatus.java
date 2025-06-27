package org.example.Design.SelectStatus;

import org.example.Design.SelectStatus.AddElements.AddElementsToPanelStatus;
import org.example.Design.SelectStatus.InitializingElements.InitializingButtonsSelectStatus;
import org.example.Design.SelectStatus.InitializingElements.InitializingLabelsSelectStatus;

import javax.swing.*;
import java.awt.*;

public class JPanelSelectStatus extends JPanel {

    public JPanelSelectStatus() {
        this.setLayout(null);
        this.setBounds(30, 22, 420, 316);
        this.setBackground(Color.white);
        addElementsToPanel();
        this.setVisible(true);
    }

    public void addElementsToPanel(){
        AddElementsToPanelStatus.addElementsToPanel(this, new InitializingLabelsSelectStatus().getListLabelsSelectStatus());
        AddElementsToPanelStatus.addElementsToPanel(this, new InitializingButtonsSelectStatus().getListButtonsSelectStatus());
    }
}
