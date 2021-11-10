package tui;
import javax.lang.model.util.ElementScanner6;

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
    
    public void start(){
        boolean running = true;
        while (running) {
            int choice = writeLPMenu();
            if (choice == 1){
                for (String lpInfoString : lpController.getAllLPs()) {
                    System.out.println(lpInfoString);
                }
            }
            else if(choice == 2){
                

            }
            else{
                running = false;
            }
        }
    }

    private int writeLPMenu(){
        TextOptions menu = new TextOptions("\n ***** LP Menu *****", "Tilbage");
        menu.addOption("Vis alle EP'er");
        menu.addOption("Søg på title");
        int choice = menu.prompt();
        return choice;
    }
}
