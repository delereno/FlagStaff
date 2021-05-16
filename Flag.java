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
    // instance variables (flag measurements)
    double moveAmt = 10;
    
    //flag coordinates
    double y = 100.0;
    final double DEFAULTX = 300.0; 
    final double WIDTH = 200;
    final double HEIGHT = WIDTH * 2.0 / 3.0;
    final double OVALPOSX = DEFAULTX + WIDTH * 3.0 / 10.0;
    final double OVALDIAM = HEIGHT * 3 / 5;
    
    //pole coordinates
    final double POLEX = 300;
    final double POLETOP = 50;
    final double POLEBOT = 750;
    /**
     * Constructor for objects of class Flag
     */
    public Flag()
    {
        
    }
    
    public void setMoveAmt(double amt) {
        moveAmt = amt;
    }
    public void clearFlag() {
        y = 100.0;
        UI.clearGraphics();
    }
    public void raiseFlag() {
        //If raised flag fits pole limit, changes y coordinate
        if ((y - moveAmt) >= POLETOP){
            y -= moveAmt;
            drawFlag();
        }
    }
    
    public void lowerFlag() {
        //If lowered flag fits pole limit, changes y coordinate
        if ((y + moveAmt + HEIGHT) <= POLEBOT){
            y += moveAmt;
            drawFlag();
        }
    }
   
    public void drawFlag() {
        //changes red circle height
        double ovalPosY = y + HEIGHT / 5;
        
        UI.clearGraphics(); //clears onscreen graphics
        
        //draws pole
        UI.setColor(Color.black);
        UI.drawLine(POLEX,POLETOP,POLEX,POLEBOT);
        
        //draws flag
        UI.drawRect(DEFAULTX, y, WIDTH, HEIGHT);
        UI.setColor(Color.red);
        UI.fillOval(OVALPOSX, ovalPosY, OVALDIAM, OVALDIAM);
    }
}

