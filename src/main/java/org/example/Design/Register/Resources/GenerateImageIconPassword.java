package org.example.Design.Register.Resources;

import org.example.Resources.GenerateImageIcon;

import javax.swing.*;
import java.awt.*;

public class GenerateImageIconPassword {

    public static ImageIcon generateImageIcon(String imageIcon, int width, int height) {
        Image image = new GenerateImageIcon(imageIcon).getImageIcon().getImage().getScaledInstance(width,height,
                Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
