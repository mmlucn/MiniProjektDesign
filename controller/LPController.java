package controller;
import java.util.ArrayList;

import model.*;

public class LPController{
    
    private LPContainer lpContainer;

    public LPController(){
        lpContainer = LPContainer.getInstance();
    }

    public LP findLP(String title){
        return lpContainer.findLP(title);
    }
    
    public boolean addLP(String barcode, String title, String artist, String publicationDate){
        if (lpContainer != null){
            lpContainer.addLP(new LP(barcode, title, artist, publicationDate));
            return true;
        }
        return false;
    }

    public ArrayList<String> getAllLPs(){
        return lpContainer.getAllLPs();
    }

    public boolean addCopyToLP(Copy copy, String lpTitle){
        LP lp = lpContainer.findLP(lpTitle);
        if (lp != null){
            lp.addCopy(copy);
            return true;
        }
        return false;
    }
}
