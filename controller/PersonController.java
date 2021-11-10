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
    
    public void deletePerson(String phoneNumber){
        personContainer.deletePerson(phoneNumber);
    }
    
    public void addPerson(Person p){    
        personContainer.addPerson(p);
    }
}
