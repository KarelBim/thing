package Dedicnost_4;
public class Hrnecek extends Nadoba {
    private double prumer;
    private double vyska;
    private String vhodnost;
    public Hrnecek(double prumer, double vyska,String material,String vhodnost) {
        super("Hrneček",material);
        this.vhodnost = vhodnost;
        this.prumer = prumer;
        this.vyska = vyska;
    }
    public double vypocetObjemu(){
        return Math.pow(prumer/2,2) * Math.PI * vyska;
    }
    public String getInfo(){
        return super.getInfo() + " Průměr " + prumer + " Výška: " + vyska + " Vhodnost: " + vhodnost;
    }

}
