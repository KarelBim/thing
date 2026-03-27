package Dedicnost_5_Vesmir;

public class Planeta extends VesmirnyObjekt {
    private double prumer;
    private String typAtmosfery;
    public Planeta(String nazev,String typ,double prumer,String typAtmosfery) {
        this.nazev=nazev;
        this.typAtmosfery=typAtmosfery;
        this.prumer=prumer;
        this.typ=typ;
    }
    public double getPrumer() {
        return prumer;
    }
    public void vypisInfo(){
        System.out.println("Nazev: "+nazev + ", Typ: "+typ + ", Prumer: "+prumer + ", Typ Atmosfery: "+typAtmosfery);
    }
}
