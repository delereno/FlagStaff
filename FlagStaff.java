import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
/**
 * Driver class that creates a FlagStaff object
 * raises and lowers a flag on a pole.
 *
 * @author Del Huang
 * @version 16/05/21k
 */
public class FlagStaff
{
    // instance variables
    
    /**Creates Flag object*/
    public  Flag flag = new Flag();
    
    // Slider min-max values
    static final double MOVEMIN = 0.0;
    static final double MOVEMAX = 400.0;
    
    // name String coordinates
    static final double STRINGX = 10.0;
    static final double STRINGY = 200.0;
    /**
     * Constructor for objects of class FlagStaff
     */
    public FlagStaff()
    {
        // creates UI button, slider and text field inputs
        UI.initialise();
        UI.addButton("Clear", flag::clearFlag);
        UI.addButton("FlagStaff", flag::drawFlag);
        UI.addButton("Raise", flag::raiseFlag);
        UI.addButton("Lower", flag::lowerFlag);
        UI.addSlider("Movement",MOVEMIN,MOVEMAX, flag::setMoveAmt);
        UI.addTextField("Country", this::printName);
        UI.addButton("Quit", UI::quit);  
    }
    
    /**
     * Main routine
     * @param args all command line arguments given by the user
     */
    public static void main (String[] args) {
        // creates new FlagStaff object
        FlagStaff flagStaff = new FlagStaff();
    }
    
    /**
     * Draws the user flag name input
     * @param flagName String input from text field
     */
    public void printName(String flagName) {
        UI.drawString(flagName, STRINGX, STRINGY);
    }
}
