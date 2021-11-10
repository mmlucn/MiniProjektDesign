package controller;
import model.*;


public class LoanController{
    private LoanContainer loanContainer;
    private PersonController personController;
    private LPController lpController;
    
    public LoanController(){
        loanContainer = LoanContainer.getInstance();
        personController = new PersonController();
        lpController = new LPController();
    }
    
    public boolean createLoan(String phoneNumber, String title, String quality, int days){
        boolean succes = true;
        Person person = personController.findPerson(phoneNumber);
        LP lp = lpController.findLP(title);
        Copy copy = lp.getCopy();
        Loan loan = new Loan(lp.getTitle(), "detteSkalGenereres", quality, days, person, copy);
        if (loanContainer.addLoan(loan)){
            succes = true;
        }
        else{
            succes = false;
        }
        return succes;
    }
    
    
}
