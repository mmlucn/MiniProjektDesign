package model;
import java.time.LocalDate;



public class Loan
{
    private String title;
    private String loanNumber;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String quality;
    
    
    public Loan(String title, String loanNumber, String quality, int days)
    {
        this.title = title;
        this.loanNumber = loanNumber;
        this.returnDate = LocalDate.now().plusDays(days);
        this.quality = quality;
        this.borrowDate = LocalDate.now();
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
