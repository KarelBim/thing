package Interface.restaurace;

import java.util.ArrayList;

public class JidloKRozvozu implements IObjednani{
    private ArrayList<Jidlo> jidla = new ArrayList<>();
    public int objednej(int pocet){
        return switch (pocet) {
            case 1, 2 -> 50;
            case 3, 4 -> 30;
            default -> 0;
        };
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
