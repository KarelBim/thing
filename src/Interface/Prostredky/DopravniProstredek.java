package Interface.Prostredky;

public class DopravniProstredek implements IDopravniProstredek{
    private String jmeno;
    public DopravniProstredek(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String pohyb(){
        return jmeno + " se pohybuje";
    }
}
