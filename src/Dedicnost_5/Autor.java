package Dedicnost_5;

public class Autor {
    private String jmeno;
    private String prijmeni;
    private int datumNarozeni;
    public Autor(String jmeno, String prijmeni, int datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
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
