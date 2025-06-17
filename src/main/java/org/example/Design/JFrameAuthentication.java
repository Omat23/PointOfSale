package org.example.Design;

import javax.swing.*;
import java.awt.*;

public class JFrameAuthentication extends JFrame {

    public JFrameAuthentication() {
        setLayout(null);
        setBounds(0,0,460,480);
        addJPanelPre_Authentication();
        this.getContentPane().setBackground(Color.decode("#76e4f8"));
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void addJPanelPre_Authentication(){
        this.add(new JPanelPre_Authentication());
    }
}
