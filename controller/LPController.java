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
}
