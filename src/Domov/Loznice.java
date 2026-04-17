package Domov;

public class Loznice extends Mistnost{
    public Loznice(){
        super("ložnice",200000);
    }
    public void popis(){
        System.out.println("v mistnosti " + getNazev() + " se nachází: ");
        vypsatNabytek();
    }
}
