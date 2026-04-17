package statics;

public class Zena extends Osoba{
    private double maxCastka;
    public Zena(int vek,String jmeno,String prijmeni,int cisloUctu,double maxCastka){
        super(vek,jmeno,prijmeni,cisloUctu);
        this.maxCastka=maxCastka;
    }
    public double getMaxCastka() {
        return maxCastka;
    }
}
