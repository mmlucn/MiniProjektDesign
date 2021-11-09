package model;

import java.util.ArrayList;


public class LoanContainer
{
    private static LoanContainer instance;
    private ArrayList<Loan> loans;
    
    
    private LoanContainer()
    {
        loans = new ArrayList<Loan>();
    }
    
    public static LoanContainer getInstance(){
        if (instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public void addLoan(Loan newLoan){
        if (loans != null){
            loans.add(newLoan);
        }
    }
    
    
}
