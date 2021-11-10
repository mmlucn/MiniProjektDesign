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
    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanController = new LoanController();
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
                TextInput ti = new TextInput();
                String userPhoneNumber = ti.inputString("Indtast tlf. nr. på bruger:");
                String lpTitle = ti.inputString("Indtast titel på LP:");
                
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
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
    
    public void createLoan(String phoneNumber, String title, String serialNumber, String quality, int days){
        boolean found = loanController.createLoan(phoneNumber, title, serialNumber, quality, days);
        if(found){
            System.out.println("Succesfull loan");
        }
        else{
            System.out.println("Wrong info, try again");
        }
    }

}
