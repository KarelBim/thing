package Interface.Ukollysd;

public class Aktivita implements IPopsatelna{
    private String nazev;
    private int delkaMinuty;
    private int maxPocetOsob;
    private int pocetOsob;
    public Aktivita(String nazev, int delkaMinutyy, int maxPocetOsob) {
        this.nazev = nazev;
        this.delkaMinuty = delkaMinutyy;
        this.maxPocetOsob = maxPocetOsob;
    }
    public int getDelkaMinuty() {
        return delkaMinuty;
    }
    public void popis(){
        System.out.println(nazev + " trvá " + delkaMinuty + " a maximální počet osob " + maxPocetOsob);
    }
    public void addOsoby(int pocetOsob){
        this.pocetOsob += pocetOsob;
    }
    public void addOsoba(){
        this.pocetOsob++;
    }
    public int getMaxPocetOsob(){
        return this.maxPocetOsob;
    }
    public int getPocetOsob(){
        return this.pocetOsob;
    }
}
