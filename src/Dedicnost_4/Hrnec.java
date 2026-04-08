package Dedicnost_4;

public class Hrnec extends Nadoba{
    private double prumer;
    private double vyska;
    private boolean maPoklicku;
    public Hrnec(String material,double prumer,double vyska,boolean maPoklicku){
        super("Hrnec",material);
        this.prumer = prumer;
        this.vyska = vyska;
        this.maPoklicku = maPoklicku;
    }
    public double vypocetObjemu() {
        return Math.pow(prumer/2,2) * Math.PI * vyska;
    }
    public String getInfo(){
        String maPoklicku = "nemá pokličku";
        if(this.maPoklicku){
            maPoklicku = "má pokličku";
        }
        return super.getInfo() + " Průměr: " + prumer + " Výška: " + vyska + " " + maPoklicku;
    }
}
