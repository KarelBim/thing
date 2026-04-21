package Pekarna;

abstract class Pecivo {
    private String nazev;
    private double cena;
    private double kcal;
    private double hodnoceni;
    public Pecivo(String nazev, double cena, double kcal,double hodnoceni) {
        this.nazev = nazev;
        this.cena = cena;
        this.kcal = kcal;
        this.hodnoceni = hodnoceni;
    }
    final double getHodnoceni(){return hodnoceni;}
    public double getCena(){return cena;}
    public double getKcal(){return kcal;}
    abstract void popis();
}
