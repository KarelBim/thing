package PohadkovaPostava;

abstract class PohadkovaPostava {
    private String jmeno;
    private int vek;
    abstract void popis();
    public PohadkovaPostava(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public int getVek() {
        return vek;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
}
