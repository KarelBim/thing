package statics;

import java.util.ArrayList;

public class Muz extends Osoba{
    private ArrayList<Zbozi> nechteneZbozi;
    public Muz(int vek,String jmeno,String prijmeni,int cisloUctu,ArrayList<Zbozi> nechteneZbozi){
        super(vek,jmeno,prijmeni,cisloUctu);
        this.nechteneZbozi = nechteneZbozi;
    }
    public boolean nechteneZbozi(Zbozi zbozi){
        for(Zbozi z : nechteneZbozi){
            if(z.getTyp().equalsIgnoreCase(zbozi.getTyp())){
                return true;
            }
        }
        return false;
    }
    public boolean nechteneZbozi(String zbozi){
        for(Zbozi z : nechteneZbozi){
            if(z.getTyp().equalsIgnoreCase(zbozi)){
                return true;
            }
        }
        return false;
    }
}
