package controller;
import model.*;
import java.util.Date;
import java.time.LocalDate;


public class LoanController{
    private LoanContainer loanContainer;
    private PersonController personController;
    private LPController lpController;
    
    public LoanController(){
        loanContainer = LoanContainer.getInstance();
        personController = new PersonController();
        lpController = new LPController();
    }
    
    public boolean createLoan(String phoneNumber, String title, String serialNumber, String quality, int days){
        boolean found = true;
        Person person = personController.findPerson(phoneNumber);
        if(person == null){
            found = false;
        }
        LP lp = lpController.findLP(title);
        if(lp == null){
            found = false;
        }
        Copy copy = lp.findCopy(serialNumber);
        if(copy == null){
            found = false;
        }
        Loan loan = new Loan(lp.getTitle(), "detteSkalGenereres", quality, days, person, copy);
        loanContainer.addLoan(loan);
        if(loan == null){
            found = false;
        }
        
        return found;
    }
    
}
