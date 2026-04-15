package PohadkovaPostava;

import java.util.Random;

public class Princezna extends PohadkovaPostava{
    public Princezna(String jmeno, int vek) {
        super(jmeno, vek);
    }
    public void popis(){
        System.out.println("Jsem princezna " + getJmeno() + " a je mi " + getVek() + " let");
    }
    public void zmenJmeno(String jmeno){
        setJmeno(jmeno);
    }
    public void zmenJmeno(String jmeno, String prijemni){
        setJmeno(jmeno + " " + prijemni);
    }
    public boolean spokojenaSJmenem(){
        Random r = new Random();
        return r.nextBoolean();
    }
}
