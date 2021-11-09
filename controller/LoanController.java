package controller;
import model.*;
import java.util.Date;
import java.time.LocalDate;


public class LoanController
{
    private LoanContainer loanContainer;
    
    public LoanController()
    {
        loanContainer = LoanContainer.getInstance();
    }
    
    public Loan createLoan(String title, String loanNumber, String quality, int days){
        return new Loan(title, loanNumber, quality, days);
    }
    
    public Person findPerson(String phoneNumber){
        return null;
    }
}
