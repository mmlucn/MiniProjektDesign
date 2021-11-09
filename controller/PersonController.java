package controller;
import model.*;
import java.util.Iterator;

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

    public void updatePerson(Person personToUpdate, String address, String postalCode, String city, String phoneNumber){
        if (address != null){
            personToUpdate.setAddress(address);
        }
        if (postalCode  != null){
            personToUpdate.setPostalCode(postalCode);
        }
        if (city  != null){
            personToUpdate.setCity(city);
        }
        if (phoneNumber != null){
            personToUpdate.setPhoneNumber(phoneNumber);
        }
    }
    
    // public Person deletePerson(String phoneNumber){
        // Person p = null;      
        // int index = 0;     
        // boolean found = false; 
        // while(index < personContainer.persons.size() && !found){
            // p = persons.get(index); 
            // if(p.getPhoneNumber().equals(phoneNumber).delete(person)){ 
                // found = true;
            // }
            // else{
                 // index++; 
                // }
         // } 
        // if (found){
            // return persons.get(index);
        // }
        // else{   
         // return null;
        // }
    // }
    
    public Person deletePerson(String phoneNumber){
        // Person p = findPerson(phoneNumber); 
        // if(p != null){
            // boolean ok = persons.remove(p); //remove an object
            // if(ok){
                // System.out.println("Cd with title " + person + "has been removed");
            // }
            // else{
                // System.out.println("Removal failed");
            // }
        // }
        // else{ 
            // System.out.println("No CD called" + person + " within the collection");
        // }
        //------
        // Iterator<Person> it = persons.iterator();
        // while(it.hasNext()){
            // Person p= it.next();
            // if(p.getphoneNumber().equals(phoneNumber){
                // it.remove();
            // }
            // else{
                // system.out.println("Person not found, piss off");
            // }
        // }
        
        Person p = null;      
        int index = 0;     
        boolean found = false; 
            p = persons.get(index); 
            if(p.getPhoneNumber().equals(phoneNumber).remove(p)){ 
        
    }
    }
    
    public void addPerson(Person p){    
        personContainer.addPerson(p);
    }
}
