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
    
    public Loan createLoan(String phoneNumber, String title, String serialNumber, String quality, int days){
        Person person = personController.findPerson(phoneNumber);
        LP lp = lpController.findLP(title);
        Copy copy = lp.findCopy(serialNumber);
        Loan loan = new Loan(lp.getTitle(), "detteSkalGenereres", quality, days, person, copy);
        loanContainer.addLoan(loan);
        return null;
    }
    
}
