package controller;
import model.*;
import java.util.Date;
import java.time.LocalDate;


public class LoanController
{
    private LoanContainer loanContainer;
    private PersonContainer personContainer;
    private LPContainer lpContainer;
    
    public LoanController()
    {
        loanContainer = LoanContainer.getInstance();
        personContainer = PersonContainer.getInstance();
        lpContainer = LPContainer.getInstance();
    }
    
    public Loan createLoan(String phoneNumber, String title, String serialNumber, String quality, int days){
        Person person = personContainer.findPerson(phoneNumber);
        LP lp = lpContainer.findLP(title);
        Copy copy = lp.findCopy(serialNumber);
        Loan loan = new Loan(lp.getTitle(), "detteSkalGenereres", quality, days, person, copy);
        loanContainer.addLoan(loan);
        return null;
    }
    
    private Person findPerson(String phoneNumber){
        return null;
    }
}
