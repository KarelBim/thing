package Pekarna;

public class Rohlik extends Pecivo{
    private String typ;
    public Rohlik(String nazev,double cena,double kcal,double hodnoceni,String typ) {
        super(nazev,cena,kcal,hodnoceni);
        this.typ = typ;
    }
    public void popis(){
        System.out.println("Typ pečiva: Rohlík " + "Cena: " + getCena() + " Typ rohlíku: " + typ);
    }
}
