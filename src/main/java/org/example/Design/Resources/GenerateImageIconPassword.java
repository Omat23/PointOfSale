package org.example.Design.Resources;

import org.example.Resources.GenerateImageIcon;

import javax.swing.*;
import java.awt.*;

public class GenerateImageIconPassword {

    public static ImageIcon generateImageIcon(String imageIcon){
        Image image = new GenerateImageIcon(imageIcon).getImageIcon().getImage().getScaledInstance(60,50,
                Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
