package Interface.restaurace;

import java.util.ArrayList;

public interface IObjednani {
    int objednej(int pocet);
    ArrayList<Jidlo> getJidla();
    public void addJidla(Jidlo jidlo, int pocet);
    public void addJidlo(Jidlo jidlo);
}
