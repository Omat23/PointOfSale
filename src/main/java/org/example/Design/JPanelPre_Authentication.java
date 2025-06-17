package org.example.Design;

import org.example.Design.JLabelsPreAuthentication.JLabelsLogin;

import javax.swing.*;
import java.awt.*;

public class JPanelPre_Authentication extends JPanel {

    public JPanelPre_Authentication() {
        setLayout(null);
        setBounds(45, 28, 360, 375);
        setBackground(Color.WHITE);
        add(new JLabelsLogin().getTittleWindowPreAuthentication());
        add(new JLabelsLogin().getLabelEmailPreAuthentication());
        add(new JLabelsLogin().getLabelPasswordPreAuthentication());
        add(new JTextFieldsPreAuthentication().getTextFieldsWindowPreAuthentication());
        add(new JTextFieldsPreAuthentication().getTextFieldPasswordPreAuthentication());
    }
}
