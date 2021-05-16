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
    private int x;

    /**
     * Constructor for objects of class FlagStaff
     */
    public FlagStaff()
    {
        UI.initialise();
        UI.addButton("Clear", this::clearFlag);
        UI.addButton("FlagStaff", this::doFlagStaff);
        UI.addButton("Raise", this::raiseFlag);
        UI.addButton("Lower", this::lowerFlag);
        // slider placeholder (flage movement amnt)
        // text field (country name)
        UI.addButton("Quit", UI::quit);  
    }
    public static void main (String[] args){
        UI.print("halo");
        FlagStaff FlagStaff = new FlagStaff();
    }
    public void clearFlag() {
        //clears screen
        //resets flag position
    }
    
    public void doFlagStaff() {
        Flag flag = new Flag();
        flag.drawFlag();
        //draws flag
    }
    
    public void raiseFlag() {
        //takes movement amount
        //calls flag raise method
    }
    
    public void lowerFlag() {
        //takes movement amount
        //calls flag lower method
    }
    
}
