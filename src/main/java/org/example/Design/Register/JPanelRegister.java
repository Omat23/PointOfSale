package org.example.Design.Register;

import org.example.Design.LoginDesign.AddElements.AddComponents;
import org.example.Design.Register.InitializingElements.InitializingJButtonsRegister;
import org.example.Design.Register.InitializingElements.InitializingJLabelsRegister;
import org.example.Design.Register.InitializingElements.InitializingJTextFieldsRegister;

import javax.swing.*;
import java.awt.*;

public class JPanelRegister extends JPanel {

    public JPanelRegister() {
        setLayout(null);
        setBounds(30, 22, 420, 520);
        setBackground(Color.WHITE);
        addComponents();
        setVisible(true);
    }

    public void addComponents(){
        AddComponents.addComponents(this, new InitializingJLabelsRegister().getLabelsRegister());
        AddComponents.addComponents(this, new InitializingJTextFieldsRegister().getTextFieldList());
        AddComponents.addComponents(this, new InitializingJButtonsRegister().getButtonsRegisterList());
    }
}
