package tui;
import controller.*;
import model.*;
import java.util.Random;

public class TestData
{
    private LPController lpController;
    private PersonController personController;
    private LoanController loanController;
    
    public TestData()
    {
        lpController = new LPController();
        personController = new PersonController();
        loanController = new LoanController();
    }
    
    public void generateData(){
        String[] firstNames = {"Zaria", "Pierre", "Omar", "Lizbeth", "Finnegan", "Emily", "Nayeli", "Soren", "Alissa", "Gael"};
        String[] lastNames = {"Chan", "Moon", "Mullen", "Ashley", "Glover", "Castro", "Vaughn", "Hebert", "Harding", "Anthony"};
        String[] addresses = {"Tværgyden 82", "Margrethes Plads 38", "Søndre Havnevej 89", "Mellemvej 88", "Kongshøj Allé 76", "Sveltekrogen 87", "Frørupvej 135", "Strandalléen 55", "Kamperhoug 50", "Mølleløkken 73"};
        String[] city = {"Aalborg", "København", "Odense", "Aarhus", "Skagen", "Frederikshavn", "Lemvig", "Thisted", "Køge", "Nyborg"};
        String[] zipCode = {"9000", "1050", "5100", "8100", "9990", "9900", "7620", "7700", "4600", "5800"};
        String[] phoneNumber = {"21899699", "22442520", "29626713", "22804241", "42859281", "81281008", "22550022", "71785255", "41426780", "61280942"};
        
        for (int i = 0; i < 10; i++){
            personController.addPerson(new Person(firstNames[i] + " " + lastNames[i], addresses[i], zipCode[i], city[i], phoneNumber[i]));
        }
        
        String[] barcode = {"978020137962", "958021135962", "528061675917", "328261665914", "328211665915", "198263605915", "828063905912", "528163605371", "571363625351", "529160605936"};
        String[] title = {"Blue Slide Park", "ABC", "Live In Stockholm 1972", "Thriller", "Abbey Road", "The Lost Boy", "Nevermind", "Red", "Graduation", "The Off-Season"};
        String[] artist = {"Mac Miller", "Jackson 5", "Ray Charles", "Michael Jackson", "The Beatles", "Cordae", "Nirvana", "Taylor Swift", "Kanye West", "J. Cole"};
        String[] publicationDate = {"08-11-2011", "01-11-2021", "10-10-2021", "01-01-1982", "01-01-1969", "26-07-2021", "24-09-1991", "04-12-2012", "01-01-2007", "04-05-2021"};
        
        for (int i = 0; i < 10; i++){
            LP lpToAdd = new LP(barcode[i], title[i], artist[i], publicationDate[i]);
            Copy copyToAdd = new Copy(randomSerial(), "10-11-2021", 50.0);
            lpToAdd.addCopy(copyToAdd);
            lpController.addLP(lpToAdd);
        }
        
    }
    
    private String randomSerial(){
        Random r = new Random();
        int n = 10000 + r.nextInt(10000); //10000-19999
        return String.valueOf(n);
    }
}
