package org.example.Resources;

import javax.swing.*;

public class GenerateImageIcon {

    private final String routeImage;

    public GenerateImageIcon(String routeImage) {
        this.routeImage = routeImage;
    }

    public ImageIcon getImageIcon(){
        return new ImageIcon("C:\\Users\\Omar\\IdeaProjects\\Point_of_Sales\\src\\main\\resources\\".concat(this.routeImage));
    }
}
