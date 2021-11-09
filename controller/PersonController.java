package controller;
import model.*;

public class PersonController
{
    private PersonContainer personContainer;

    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        this.personContainer = personContainer.getInstance();
        
    }

    public Person createPerson(String name, String address, String postalCode, String city, 
    String phoneNumber){    
        Person p = new Person(name, address, postalCode, city, phoneNumber);
    return p;
    }
    
    public Person findPerson(String phoneNumber){
        return personContainer.findPerson(phoneNumber);
    }
    
    // public Person updatePerson(String name, String address, String postalCode, String city, 
    // String phoneNumber){
        
    // }
    
    public Person updatePerson(){
        return null;
    }
    
    public void addPerson(Person p){    
        personContainer.addPerson(p);
    }
}
