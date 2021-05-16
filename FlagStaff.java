import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
/**
 * Creates a FlagStaff object
 * raises and lowers a flag on a pole.
 *
 * @author Del Huang
 * @version 16/05/21k
 */
public class FlagStaff
{
    // instance variables - replace the example below with your own
    public int moveAmt = 10;
    final public String flagName = "";
    public  Flag flag = new Flag();
    /**
     * Constructor for objects of class FlagStaff
     */
    public FlagStaff()
    {
        final double MOVEMIN = 0.0;
        final double MOVEMAX = 400.0;
        final double MOVEINT = 1.0;
        UI.initialise();
        UI.addButton("Clear", flag::clearFlag);
        UI.addButton("FlagStaff", flag::drawFlag);
        UI.addButton("Raise", flag::raiseFlag);
        UI.addButton("Lower", flag::lowerFlag);
        UI.addSlider("Movement",MOVEMIN,MOVEMAX, flag::setMoveAmt);
        UI.addTextField("Country", this::printName);
        UI.addButton("Quit", UI::quit);  
    }
    public static void main (String[] args){
        FlagStaff FlagStaff = new FlagStaff();
    }
    
    
    public void printName(String flagName) {
        UI.drawString(flagName,10.0,200.0);
    }
    public void raiseFlag() {
        //takes movement amount
        //calls flag raise method
        flag.raiseFlag();
    }
    
    public void lowerFlag() {
        //takes movement amount
        //calls flag lower method
    }
    
}
