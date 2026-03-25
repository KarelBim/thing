package Dedicnost;


public class Auto extends ZavodniVozidlo{
    private int pocetDveri;
    public Auto(String znacka,String barva,int rychlostmax,int pocetDveri) {
        super(znacka,barva,rychlostmax);
        if(pocetDveri<0){
            pocetDveri=0;
        }
        this.pocetDveri = pocetDveri;
    }

    public String getInfo() {
        return super.getInfo() + " " + pocetDveri;
    }
    public String zavod(){
        return getZnacka() + " jede pomalu";
    }
    public int getPocetDveri() {
        return pocetDveri;
    }

    public void info() {
        super.info();
        System.out.println(" počet dveří: "+ pocetDveri);
    }
}
