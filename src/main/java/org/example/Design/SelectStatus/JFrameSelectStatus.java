package org.example.Design.SelectStatus;

import javax.swing.*;
import java.awt.*;

public class JFrameSelectStatus extends JFrame {

    public JFrameSelectStatus() throws HeadlessException {
        this.setLayout(null);
        this.setBounds(0,0,500,400);
        this.getContentPane().setBackground(Color.decode("#67d5ee"));
        this.add(getPanelSelectStatus());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JPanel getPanelSelectStatus(){
        return new JPanelSelectStatus();
    }
}
