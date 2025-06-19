package org.example.Design.LoginDesign;


import org.example.Design.LoginDesign.AddElements.AddComponents;
import org.example.Design.LoginDesign.InitializingElements.InitializingJButtonsLogin;
import org.example.Design.LoginDesign.InitializingElements.InitializingJTextFieldsLogin;
import org.example.Design.LoginDesign.InitializingElements.InitializingLabelsLogin;

import javax.swing.*;
import java.awt.*;

public class JPanelLogin extends JPanel {

    public JPanelLogin() {
        setLayout(null);
        setBounds(45, 28, 360, 375);
        setBackground(Color.WHITE);
        addComponents();
        setVisible(true);
    }

    public void addComponents(){
        AddComponents.addComponents(this, new InitializingLabelsLogin().getListLabelsLogin());
        AddComponents.addComponents(this, new InitializingJTextFieldsLogin().getJTextFieldsLogin());
        AddComponents.addComponents(this, new InitializingJButtonsLogin().getListButtons());
    }

}
