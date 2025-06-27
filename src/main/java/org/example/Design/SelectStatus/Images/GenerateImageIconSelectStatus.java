package org.example.Design.SelectStatus.Images;

import org.example.Resources.GenerateImageIcon;

import javax.swing.*;
import java.awt.*;

public class GenerateImageIconSelectStatus {

    public static ImageIcon getImageIconSelectStatus(String nameImage){
        Image image = new GenerateImageIcon(nameImage).getImageIcon().getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
