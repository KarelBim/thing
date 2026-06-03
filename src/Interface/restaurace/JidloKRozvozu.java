package Interface.restaurace;

import java.util.ArrayList;

public class JidloKRozvozu implements IObjednani{
    private double cena;
    private ArrayList<Jidlo> jidla = new ArrayList<>();
    public void objednej(int pocet){
         switch (pocet) {
            case 1, 2 -> this.cena += 50;
            case 3, 4 -> this.cena += 30;
        };
    }
    public void addCena(double cena){
        this.cena = cena;
    }
    public double getCena(){
        return cena;
    }
    public ArrayList<Jidlo> getJidla() {
        return jidla;
    }
    public void addJidlo(Jidlo jidlo){
        jidla.add(jidlo);
    }
    public void addJidla(Jidlo jidlo, int pocet){
        while(pocet > 0){
            jidla.add(jidlo);
            pocet--;
        }
    }
}
