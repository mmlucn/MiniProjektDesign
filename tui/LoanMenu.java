package tui;
import controller.*;

/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    // instance variables 
    private LoanController loanController;
    private LPController lpController;
    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanController = new LoanController();
        lpController = new LPController();
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
                String userPhoneNumber = TextInput.inputString("Indtast tlf. nr. på bruger:");
                String lpTitle = TextInput.inputString("Indtast titel på LP:");
                String lpQuality = TextInput.inputString("Indtast kvalitet på LP: ");
                int lpDays = TextInput.inputNumber("Hvor mange dage skal den udlånes?");
                if (loanController.createLoan(userPhoneNumber, lpTitle, lpQuality, lpDays))
                {
                    System.out.println("Lån oprettet");
                }
                else{
                    System.out.println("Kunne ikke oprette lån.");
                }

            }
            //TODO perhaps you need further menu items?
            else {
                running = false;
            }
        }
    }

    private int writeLoanMenu() {
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n ***** Udlånsmenu *****", "Tilbage"); 
        menu.addOption("Opret lån");
        int choice = menu.prompt();

        return choice;
    }

}
