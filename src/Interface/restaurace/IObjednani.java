package Interface.restaurace;

import java.util.ArrayList;

public interface IObjednani {
    void objednej(int pocet);
    ArrayList<Jidlo> getJidla();
    public void addCena(double cena);
    double getCena();
    public void addJidla(Jidlo jidlo, int pocet);
    public void addJidlo(Jidlo jidlo);
}
