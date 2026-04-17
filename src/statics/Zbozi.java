package statics;

public class Zbozi {
    private double cena;
    private String typ;
    private String name;
    public Zbozi(double cena, String typ,String name) {
        this.cena = cena;
        this.typ = typ;
        this.name = name;
    }
    public double getCena() {
        return cena;
    }
    public String getTyp() {
        return typ;
    }
}
