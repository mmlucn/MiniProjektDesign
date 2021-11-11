package controller;
import model.*;

public class PersonController{
    private PersonContainer personContainer;
    
    public PersonController(){
        personContainer = PersonContainer.getInstance();
    }

    public void createPerson(String name, String address, String postalCode, String city, String phoneNumber){    
        personContainer.addPerson(new Person(name, address, postalCode, city, phoneNumber));
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
}
