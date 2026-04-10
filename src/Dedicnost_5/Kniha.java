package Dedicnost_5;

public class Kniha {
    private int id;
    private Autor autor;
    private String nazev;
    private int rokVydani;
    private double cena;
    public Kniha(Autor autor, String nazev, int rokVydani, double cena,int id) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.cena = cena;
        this.autor = autor;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    final void vypisInfo(){
        System.out.println("Název: " + nazev + " Rok vadání: " + rokVydani + " Autor: " + autor.getCeleJmeno() + " Cena: " + cena + "kč");
    }
    public void vypisInfo(int typUzivatele){
        switch(typUzivatele){
            case 0:
                vypisInfo();
                break;
            case 1:
                System.out.print("Název: " + nazev + " Rok vadání: " + rokVydani + " Autor: " + autor.getCeleJmeno()  + " Cena: " + cena * 0.95 + "kč");
                break;
            case 2:
                System.out.print("Název: " + nazev + " Rok vadání: " + rokVydani + " Autor: " + autor.getCeleJmeno() + " Cena: " + cena * 0.85 + "kč");
                break;
            default:
                System.out.println("er");
        }

    }
    public double getCena(){
        return cena;
    }
    public double getCena(int typUzivatele){
        switch(typUzivatele){
            case 0:
                return cena;
                case 1:
                    return cena * 0.95;
            case 2:
                return cena * 0.85;
        }
        return 0;
    }
}
