package model;
import java.util.ArrayList;

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

}