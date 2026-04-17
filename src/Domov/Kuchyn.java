package Domov;

public class Kuchyn extends Mistnost{
    public Kuchyn(){
        super("Kuchyň", 100000);
    }
    public void popis(){
        System.out.println("v mistnosti " + getNazev() + " se nachází: ");
        vypsatNabytek();
    }
}
