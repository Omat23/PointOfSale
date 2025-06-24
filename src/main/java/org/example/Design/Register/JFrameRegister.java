package org.example.Design.Register;

import javax.swing.*;
import java.awt.*;

public class JFrameRegister extends JFrame {

    public JFrameRegister() throws HeadlessException {
            setLayout(null);
            setBounds(0,0,500,620);
            this.getContentPane().setBackground(Color.decode("#67d5ee"));
            add(new JPanelRegister(this));
            setVisible(true);
            setLocationRelativeTo(null);
            setResizable(false);
    }
}
