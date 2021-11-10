package model;

import java.util.ArrayList;


public class LPContainer
{
    private static LPContainer instance;
    private ArrayList<LP> LPs;
    
    
    private LPContainer()
    {
        LPs = new ArrayList<LP>();
    }
    
    public static LPContainer getInstance(){
        if (instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public LP findLP(String barcode){
        if (LPs != null){
            for (LP lp : LPs){
                if (lp.getBarcode().equals(barcode))
                {
                    return lp;
                }
            }
        }
        return null;
    }
    
    public void addLP(LP newLP){
        if (LPs != null){
        	LPs.add(newLP);
        }
    }
    
    
}
