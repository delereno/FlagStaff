import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
/**
 * Flag support class
 * Checks flag height limits 
 * Lowers, raises and draws flag
 * @author Del Huang
 * @version 16/05/21
 */
public class Flag
{
    final double DEFAULTX = 300.0; 
    final double DEFAULTY = 100.0; 

    /**
     * Constructor for objects of class Flag
     */
    public Flag()
    {
        
    }

    public void drawFlag() {
        UI.clearGraphics(); //clears onscreen graphics
        
        //asks for flag width, calculates other measurements
        double width = 200;
        double height = width * 2.0 / 3.0;
        double ovalPosX = DEFAULTX + width * 3.0 / 10.0;
        double ovalPosY = DEFAULTY + height / 5;
        double ovalDiam = height * 3 / 5;
        
        //draws flag
        UI.setColor(Color.black); //flag outline
        UI.drawRect(DEFAULTX, DEFAULTY, width, height);
        
        UI.setColor(Color.red);
        UI.fillOval(ovalPosX, ovalPosY, ovalDiam, ovalDiam);
    }
}

