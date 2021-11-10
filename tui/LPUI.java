package tui;
import controller.*;

/**
 * Write a description of class LPUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPUI
{
    LPController lpController;
    
    public LPUI()
    {
        lpController = new LPController();
    }
    
    private int writeLPMenu(){
        TextOptions menu = new TextOptions("\n ***** LP Menu *****", "Tilbage");
        return 0;
    }
}
