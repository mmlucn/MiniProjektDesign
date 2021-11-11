package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Copy {
    private String serialNumber;
    private LocalDate purchaseDate;
    private boolean isAvailable;
    private double purchasePrice;

    public Copy(String serialNumber, String purchaseDate, double purchasePrice) { 
        this.serialNumber = serialNumber;
        this.purchaseDate = LocalDate.parse(purchaseDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.purchasePrice = purchasePrice;
        this.isAvailable = true;
    }

    public void setIsAvailable(boolean input){
        isAvailable = input;
    }
    
    public boolean isAvailable(){
        return isAvailable;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

}
