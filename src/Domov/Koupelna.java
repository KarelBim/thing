package Domov;

public class Koupelna extends Mistnost{
    public Koupelna(){
        super("Koupelna",10000);
    }
    public void popis(){
        System.out.println("v mistnosti " + getNazev() + " se nachází: ");
        vypsatNabytek();
    }
}
