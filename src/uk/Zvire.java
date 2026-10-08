package uk;

public abstract class Zvire {
    private int rokNarozeni;
    private String jmeno;
    public Zvire(String jmeno,int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
        this.jmeno = jmeno;
    }
    public void vypisJmenoADatum(){
        System.out.println(jmeno + ", " + rokNarozeni);
    };
    public abstract void vydejZvuk();
    public String getJmeno() {
        return jmeno;
    }
    public int getRokNarozeni() {
        return rokNarozeni;
    }
}
