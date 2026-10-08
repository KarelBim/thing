package uk;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerZoo {
    private ArrayList<Zvire> zvirata = new ArrayList<>();
    public void pridatZvire(Zvire zvire)
    {
        zvirata.add(zvire);
    }
    public void removeZvire(Zvire zvire)
    {
        zvirata.remove(zvire);
    }
    public ArrayList<Zvire> getZvirata()
    {
        return zvirata;
    }
    public void removeZvire(String jmeno)
    {
        for(Zvire zvire:zvirata){
            if(zvire.getJmeno().equalsIgnoreCase(jmeno)){
                zvirata.remove(zvire);
                return;
            }
        }
        System.out.println("Zvíře nenalezeno");
    }
    public void vypsatZvirata(){
        if(zvirata.isEmpty()){
            System.out.println("Nejsou zvířata");
        }
        for(Zvire zvire:zvirata){
            zvire.vypisJmenoADatum();
        }
    }
    public Zvire getNejmladsiZvire(){
        Zvire nejmladsiZvire = null;
        for(Zvire zvire:zvirata){
            if(nejmladsiZvire==null || zvire.getRokNarozeni() > nejmladsiZvire.getRokNarozeni()){
                nejmladsiZvire = zvire;
            }
        }
        return nejmladsiZvire;
    }
    public Zvire getNejstarsiZvire(){
        Zvire nejstarsiZvire = null;
        for(Zvire zvire:zvirata){
            if(nejstarsiZvire==null || zvire.getRokNarozeni() < nejstarsiZvire.getRokNarozeni()){
                nejstarsiZvire = zvire;
            }
        }
        return nejstarsiZvire;
    }
}
