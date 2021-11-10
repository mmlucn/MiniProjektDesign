package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Copy {
    private String serialNumber;
    private LocalDate purchaseDate;
    private double purchasePrice;

    public Copy(String serialNumber, String purchaseDate, double purchasePrice) { 
    this.serialNumber = serialNumber;
    this.purchaseDate = LocalDate.parse(purchaseDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    this.purchasePrice = purchasePrice;
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
