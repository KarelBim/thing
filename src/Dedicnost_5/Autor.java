package Dedicnost_5;

public class Autor {
    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    public Autor(String jmeno, String prijmeni, String datumNarozeni) {
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
}
