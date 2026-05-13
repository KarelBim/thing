package Interface.Postavi;

public class Bojovnik extends Postava implements IUtocnik {
    public Bojovnik(String jmeno, int zivoty) {
        super(jmeno, zivoty);
    }
    public int utoc(){
        return 15;
    }
    public String pohyb(){
        return getJmeno() + " běží";
    }
}
