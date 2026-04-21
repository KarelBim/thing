package Pekarna;

public class Chleba extends Pecivo{
    private int hmotnost;
    private String typMouky;
    public Chleba(String nazev,double cena,double kcal,double hodnoceni,int hmotnost,String typMouky){
        super(nazev,cena,kcal,hodnoceni);
        this.hmotnost=hmotnost;
        this.typMouky=typMouky;
    }
    public void popis(){
        System.out.println("Typ pečiva: Chleba " + "Cena: " + getCena() + " Typ Mouky: " + typMouky + " Hmotnosts: " + hmotnost);
    }
}
