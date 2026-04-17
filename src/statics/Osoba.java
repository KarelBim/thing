package statics;

public class Osoba {
    private int vek;
    private String jmeno;
    private String prijmeni;
    private int cisloUctu;
    public Osoba(int vek, String jmeno, String prijmeni,int cisloUctu) {
        this.vek = vek;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.cisloUctu = cisloUctu;
    }
    public int getVek() {
        return vek;
    }
    public int getCisloUctu() {
        return cisloUctu;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public String getCeleJmeno(){
        return jmeno + " " + prijmeni;
    }
}
