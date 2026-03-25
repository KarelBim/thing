package Dedicnost;

public class ZavodniVozidlo {
    private String znacka;
    private String barva;
    private int maxRychlost;
    public ZavodniVozidlo(String znacka, String barva, int maxRychlost) {
        this.znacka = znacka;
        this.barva = barva;
        this.maxRychlost = maxRychlost;
    }
    public String getInfo() {
        return znacka + " " + barva +" "+ maxRychlost;
    }
    public void info(){
        System.out.print("značka: " + znacka + " barva: " + barva + " maximální rychlost: "+ maxRychlost);
    }
    public String zavod(){
        return getZnacka() + " se řítí zatáčkou";
    }
    public String getZnacka() {
        return znacka;
    }
    public String getBarva() {
        return barva;
    }
    public int getMaxRychlost() {
        return maxRychlost;
    }
}
