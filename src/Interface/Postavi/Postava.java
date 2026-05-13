package Interface.Postavi;

public class Postava implements IPohyblivy {
    private String jmeno;
    private int zivoty;
    public Postava(String jmeno, int zivoty) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
    }
    public String pohyb(){
        return jmeno + " se pohybuje";
    }
    public String getJmeno() {
        return jmeno;
    }
}
