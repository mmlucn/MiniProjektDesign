package model;
import java.util.ArrayList;

<<<<<<< Updated upstream
public class Person {
	private String name;
	private String address;
	private String postalCode;
	private String city;
	private String phoneNumber;
	
	public Person(String name, String address, String postalCode, String city, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
=======

public class Person
{
    private String name;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private String city;  
    
    //constructor
    public Person(String name, String address, String postalCode, String city, 
    String phoneNumber)
    {
        // initialise instance variables
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        //persons = new ArrayList<>();
        
    }

    //methods
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPostalCode(){
        return postalCode;
    }
    
    public String getCity(){
        return city;
    }
    
>>>>>>> Stashed changes
}
