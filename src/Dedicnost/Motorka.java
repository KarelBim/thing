package Dedicnost;

public class Motorka extends ZavodniVozidlo {
    private double objemMotoru;
    public Motorka(String znacka,String barva,int maxRychlost, double objemMotoru) {
        super(znacka,barva,maxRychlost);
        this.objemMotoru = objemMotoru;
    }
    public String getInfo() {
        return super.getInfo() + " " + objemMotoru;
    }
    public double getObjemMotoru() {
        return objemMotoru;
    }
    public void info(){
        super.info();
        System.out.println(" objem motoru: " + objemMotoru);
    }
    public String zavod(){
        return getZnacka() + " jede na dvou kolech";
    }
}
