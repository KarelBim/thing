package Domov;

public class Nabytek {
    private String nazev;
    private double cena;
    public Nabytek(String nazev, double cena) {
        this.nazev = nazev;
        this.cena = cena;
    }
    public String getNazev() {
        return nazev;
    }
    public double getCena(){return cena;}
}
