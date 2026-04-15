package Domov;

public class Kuchyn extends Mistnost{
    public Kuchyn(){
        super("Kuchyň", 50000);
    }
    public void popis(){
        System.out.println("v mistnosti " + getNazev() + " se nachází: ");
        vypsatNabytek();
    }
}
