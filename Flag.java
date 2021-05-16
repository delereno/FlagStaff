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
    
    // flag movement amount
    double moveAmt = 10;
    
    // flag coordinates
    double y = 100.0;
    static final double DEFAULTX = 300.0; 
    static final double WIDTH = 200;
    static final double HEIGHT = WIDTH * 2.0 / 3.0;
    static final double OVALPOSX = DEFAULTX + WIDTH * 3.0 / 10.0;
    static final double OVALDIAM = HEIGHT * 3 / 5;
    
    // pole coordinates
    static final double POLEX = 300;
    static final double POLETOP = 50;
    static final double POLEBOT = 750;
    
    /**
     * Constructor for Flag class objects
     */
    public Flag()
    {
    }
    
    /**
     * Sets the flag's movement amount
     * @param amt movement amount
     */
    public void setMoveAmt(double amt) {
        moveAmt = amt;      // sets move amount
    }
    
    /**
     * Clears the graphics pane, resets y coordinate
     */
    public void clearFlag() {
        y = 100.0;          // sets default flag height
        UI.clearGraphics(); // clears screen
    }
    
    /**
     * If within pole limits, raises the flag
     */
    public void raiseFlag() {
        // If raised flag does not exceed pole top, changes y coordinate
        if ((y - moveAmt) >= POLETOP) {
            y -= moveAmt;   // raises flag
            drawFlag();     // draws new flag
        }
    }
    
    /**
     * If within pole limits, lowers the flag
     */
    public void lowerFlag() {
        // If lowered flag does not exceed pole bottom, changes y coordinate
        if ((y + moveAmt + HEIGHT) <= POLEBOT) {
            y += moveAmt;   // lowers flag
            drawFlag();     // draws new flag
        }
    }
    
    /**
     * Draws the flag
     */
    public void drawFlag() {
        // changes red circle height
        double ovalPosY = y + HEIGHT / 5;
        
        UI.clearGraphics(); //clears onscreen graphics
        
        // draws pole
        UI.setColor(Color.black);
        UI.drawLine(POLEX, POLETOP, POLEX, POLEBOT);
        
        // draws flag
        UI.drawRect(DEFAULTX, y, WIDTH, HEIGHT);
        UI.setColor(Color.red);
        UI.fillOval(OVALPOSX, ovalPosY, OVALDIAM, OVALDIAM);
    }
}

