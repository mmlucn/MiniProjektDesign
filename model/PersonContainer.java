package model;
import java.util.ArrayList;

public class PersonContainer{
    private static PersonContainer instance;
    private ArrayList<Person> persons;    
    private PersonContainer(){
        persons = new ArrayList<>();
   }

   public static PersonContainer getInstance(){
        if(instance == null){
            instance = new PersonContainer();
        }
        return instance;
   }
    
   public void addPerson(Person person){
       persons.add(person);
   }
   
   public boolean deletePerson(String phoneNumber){
       boolean found = false;
       Person p = findPerson(phoneNumber);
       if(p!= null){
           persons.remove(p);
       }
       else{
           found = true;
       }
       return found;
   }

   public Person findPerson(String phoneNumber){
        Person p = null;      
        int index = 0;     
        boolean found = false; 
        while(index < persons.size() && !found){
            p = persons.get(index); 
            if(p.getPhoneNumber().equals(phoneNumber)){ 
                found = true;
            }
            else{
                 index++; 
                }
         } 
        if (found){
            return persons.get(index);
        }
        else{   
         return null;
        }
        
        
    }
   
}
