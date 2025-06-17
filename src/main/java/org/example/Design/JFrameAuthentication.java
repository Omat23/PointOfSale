package org.example.Design;

import javax.swing.*;

public class JFrameAuthentication extends JFrame {

    public JFrameAuthentication() {
        setLayout(null);
        setBounds(0,0,460,480);
        addJPanelPre_Authentication();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void addJPanelPre_Authentication(){
        this.add(new JPanelPre_Authentication());
    }
}
