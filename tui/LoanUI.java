package tui;
import controller.*;


public class LoanUI{
    private LoanController loanController;
    
    public LoanUI(){
     
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
