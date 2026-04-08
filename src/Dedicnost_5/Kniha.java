package Dedicnost_5;

public class Kniha {
    private Autor autor;
    private String nazev;
    private int rokVydani;
    private double cena;
    public Kniha(Autor autor, String nazev, int rokVydani, double cena) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.cena = cena;
        this.autor = autor;
    }
    final void vypisInfo(){
        System.out.println("Název: " + nazev + " Rok vadání: " + rokVydani + " Cena: " + cena + "kč");
    }
}
