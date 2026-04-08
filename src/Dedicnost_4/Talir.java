package Dedicnost_4;

public class Talir extends Nadoba{
    private String typtalire;
    private double prumer;
    public Talir(String typtalire,String material,double prumer){
        super("Talíř",material);
        this.typtalire=typtalire;
        this.prumer=prumer;
    }
    public String getInfo(){
        return super.getInfo() + " Typ talíře: " + typtalire + " Průměr: " + prumer;
    }
}
