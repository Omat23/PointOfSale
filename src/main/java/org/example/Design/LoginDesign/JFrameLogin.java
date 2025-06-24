package org.example.Design.LoginDesign;

import javax.swing.*;
import java.awt.*;

public class JFrameLogin extends JFrame {

    public JFrameLogin() {
        setLayout(null);
        setBounds(0,0,460,480);
        addJPanelPre_Authentication();
        this.getContentPane().setBackground(Color.decode("#67d5ee"));
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void addJPanelPre_Authentication(){
        this.add(new JPanelLogin(this));
    }
}
