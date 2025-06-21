package org.example.Design.Register.AddElementsToRegister;

import javax.swing.*;
import java.util.List;

public class AddElementsToRegister {

    public static void addElements(JPanel panelRegister, List<? extends JComponent> listObjects){
        for(JComponent elements : listObjects){
            panelRegister.add(elements);
        }
    }


}
