package tui;
import controller.*;

public class PersonUI{
    private PersonController personController;
    private LoanUI loanUI;

    public PersonUI(){
        
    }

    public void createPerson(String name, String address, String postalCode, String city, 
    String phoneNumber){
        personController.createPerson(name, address, postalCode, city, phoneNumber);
        System.out.println("Person has been created");
    }
    
    public void findPerson(String phoneNumber){
        if(personController.findPerson(phoneNumber) = null){
            System.out.println("Person do not exist");
        }
        else{
        System.out.println("Person is found");
        }
    } 
    
    
    
    
    
}
