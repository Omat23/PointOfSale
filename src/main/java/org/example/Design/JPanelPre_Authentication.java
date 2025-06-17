package org.example.Design;

import javax.swing.*;
import java.awt.*;

public class JPanelPre_Authentication extends JPanel {

    public JPanelPre_Authentication() {
        setLayout(null);
        setBounds(22, 12, 400, 405);
        setBackground(Color.decode("#76e4f8"));
        add(new JLabelTitlePreAuthentication().getTittleWindowPreAuthentication());
        add(new JTextFieldsPreAuthentication().getTextFieldsWindowPreAuthentication());
    }
}
