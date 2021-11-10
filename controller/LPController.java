package controller;
import model.*;

public class LPController{
    
    private LPContainer lpContainer;
    private LP lp;

    public LPController(){
        lpContainer = LPContainer.getInstance();
    }

    public LP findLP(String title){
        return lpContainer.findLP(title);
    }
    
    public Copy findCopy(String serialNumber){
        return lp.findCopy(serialNumber);
    }
    
    public void addLP(LP lp){
        if (lpContainer != null){
            lpContainer.addLP(lp);
        }
    }
    
    public LP createLP(String barcode, String title, String artist, String publicationDate)
    {
        return new LP(barcode, title, artist, publicationDate);
    }
    
    public void addCopyToLP(Copy copy, LP lp){
        lp.addCopy(copy);
    }
}
