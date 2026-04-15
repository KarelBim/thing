package Dedicnost_6;

import java.util.Random;

public class OsobniVlak extends Vlak {
    public OsobniVlak(String nazev) {
        this.nazev = nazev;
    }
    public void spustit(){
        System.out.println("Ze stanice vyjíždí osobní vlak " + nazev);
    }
    public void zastavitSe(){
        Random r = new Random();
        System.out.println("Vlak " + nazev + " přijíždí na nastupište č. " + (r.nextInt(0,4) + 1) + " kolej " + (r.nextInt(0,4) + 1));
    }
}
