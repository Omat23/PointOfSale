package org.example.Design.SelectStatus.AddElements;

import javax.swing.*;
import java.util.List;

public class AddElementsToPanelStatus {

    public static void addElementsToPanel(JPanel panelSelectStatus, List< ? extends JComponent > listElements){
        for (JComponent elementsFromList : listElements){
            panelSelectStatus.add(elementsFromList);
        }
    }

}
