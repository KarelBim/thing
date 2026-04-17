package Domov;

public class Koupelna extends Mistnost{
    public Koupelna(){
        super("Koupelna",50000);
    }
    public void popis(){
        System.out.println("v mistnosti " + getNazev() + " se nachází: ");
        vypsatNabytek();
    }
}
