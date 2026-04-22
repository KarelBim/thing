package Interface.int4;

public class Postava {
    protected int zivoty;
    protected String jmeno;
    protected int utok;
    public Postava(String jmeno, int zivoty,int utok) {
        this.zivoty = zivoty;
        this.jmeno = jmeno;
        this.utok = utok;
    }
    public int getZivoty() {
        return zivoty;
    }
    protected String getJmeno() {
        return jmeno;
    }
    public int getUtok() {
        return utok;
    }
}
