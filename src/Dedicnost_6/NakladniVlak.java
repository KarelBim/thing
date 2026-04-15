package Dedicnost_6;

public class NakladniVlak extends Vlak{
    private String typNakladu;
    public NakladniVlak(String nazev, String typNakladu){
        this.typNakladu = typNakladu;
        this.nazev = nazev;
    }
    public void spustit(){
        System.out.println("Ze statnice vyjíždí nákladní vlak " + nazev);
    }
    public void vylozitNaklad(){
        System.out.println("Přijel nákladní vlak " + nazev + " s nákladem " + typNakladu);
    }

}
