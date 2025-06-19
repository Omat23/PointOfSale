package org.example.Design.LoginDesign.AddElements;

import javax.swing.*;
import java.util.List;

public class AddComponents {

    public static void addComponents(JPanel panel, List< ? extends JComponent> components){
        for(JComponent component : components){
            panel.add(component);
        }
    }

}
