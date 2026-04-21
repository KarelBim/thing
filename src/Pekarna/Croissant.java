package Pekarna;

public class Croissant extends Pecivo{
    private String napln;
    public Croissant(String nazev,double cena,double kcal,double hodnoceni,String napln){
        super(nazev,cena,kcal,hodnoceni);
        this.napln=napln;
    }
    public void popis(){
        System.out.println("Typ pečiva: Croissant " + "Cena: " + getCena() + " Náplň: " + napln);
    }
}
