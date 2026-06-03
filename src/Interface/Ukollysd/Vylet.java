package Interface.Ukollysd;

public class Vylet extends Aktivita implements IRezervovatelna,IPlacena{
    private double cenaZaOsobu;
    public Vylet(String nazev,int delkaMinuty,int maxPocetOsob,double cenaZaOsobu) {
        super(nazev,delkaMinuty,maxPocetOsob);
        this.cenaZaOsobu = cenaZaOsobu;
    }
    public boolean rezervovatelna() {
        return getMaxPocetOsob() - getPocetOsob() > 0;
    }
    public double getCena(int pocetOsob){
        return cenaZaOsobu * pocetOsob;
    }

    public double getCenaZaOsobu() {
        return cenaZaOsobu;
    }
}
