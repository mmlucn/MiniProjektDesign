package model;
import java.time.LocalDate;



public class Loan{
    private String title;
    private String loanNumber;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String quality;
    private Person person;
    private Copy copy;
    
    public Loan(String title, String loanNumber, String quality, int days, Person person, Copy copy){
        this.title = title;
        this.loanNumber = loanNumber;
        this.returnDate = LocalDate.now().plusDays(days);
        this.quality = quality;
        this.borrowDate = LocalDate.now();
        this.person = person;
        this.copy = copy;
    }
    
        public String getTitle() {
        return title;
    }


    public String getLoanNumber() {
        return loanNumber;
    }


    public LocalDate getBorrowDate() {
        return borrowDate;
    }


    public LocalDate getReturnDate() {
        return returnDate;
    }


    public String getQuality() {
        return quality;
    }
    
}
