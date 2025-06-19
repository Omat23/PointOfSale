package org.example.Design.Register;

import org.example.Design.Register.JComponents.JLabelsRegister;

import javax.swing.*;
import java.awt.*;

public class JPanelRegister extends JPanel {

    public JPanelRegister() {
        setLayout(null);
        setBounds(30, 22, 420, 465);
        setBackground(Color.WHITE);
        add(new JLabelsRegister().getTitleRegister());
        setVisible(true);
    }
}
