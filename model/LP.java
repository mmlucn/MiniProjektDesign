package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class LP {
    private String barcode;
    private String title;
    private String artist;
    private LocalDate publicationDate;
    private ArrayList<Copy> copies;

    public LP(String barcode, String title, String artist, String publicationDate) {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = LocalDate.parse(publicationDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        copies = new ArrayList<Copy>();
    }

    public void addCopy(Copy copy){
        if (copies != null){
            copies.add(copy);
        }
    }

    public Copy findCopy(String serialNumber){
        if (copies != null){
            for (Copy copy : copies){
                if (copy.getSerialNumber().equals(serialNumber)){
                    return copy;
                }
            }
        }
        return null;
    }
    
    public String getBarcode() {
        return barcode;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
}
