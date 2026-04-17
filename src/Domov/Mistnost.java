package Domov;

import java.util.ArrayList;

abstract class Mistnost {
    private String nazev;
    private double maximalniCena;
    private ArrayList<Nabytek> nabytek = new ArrayList<>();
    abstract void popis();
    public void setNazev(String nazev) {this.nazev = nazev;}
    public void removeNabytek(int n){
        nabytek.remove(n);
    }
    public void vypsatNabytek(){
        int n = 1;
        for (Nabytek nabytek : nabytek) {
            System.out.println(n + " - " + nabytek.getNazev());
            n++;
        }
    }
    public Mistnost(String nazev, double maximalniCena) {
        this.nazev = nazev;
        this.maximalniCena = maximalniCena;
    }
    public double getCenaNabytku(){
        double celkovaCena = 0;
        for (Nabytek nabytek : nabytek) {
            celkovaCena += nabytek.getCena();
        }
        return celkovaCena;
    }
    public void addNabytek(Nabytek nabytek) {
        if(getCenaNabytku() + nabytek.getCena() > maximalniCena){
            System.out.println("Dosažena maximální cena vybavení");
            System.out.println("Zbývá: " + (maximalniCena - getCenaNabytku()));
        }
        else {
            this.nabytek.add(nabytek);
        }
    }
    public String getNazev(){return nazev;}
    public int getPocetNabytku(){return nabytek.size();}
}
