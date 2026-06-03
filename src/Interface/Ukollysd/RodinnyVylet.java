package Interface.Ukollysd;

public class RodinnyVylet extends Vylet implements IVhodneProDeti{
    public RodinnyVylet(String nazev,int delkaMinuty,int maxPocetOsob,double cenaZaOsobu) {
        super(nazev,delkaMinuty,maxPocetOsob,cenaZaOsobu);
    }
    public boolean jeVhodneProDeti(){
        return true;
    }
}
