package Dedicnost_3;

public class Reditel extends Osoba{
    private int pocetZastupcu;
    public Reditel(String name,int age, int pocetZastupcu) {
        super(name,age);
        this.pocetZastupcu = pocetZastupcu;
    }
    public int getPocetZastupcu() {
        return pocetZastupcu;
    }
    public void predstavSe(){
        super.predstavSe();
        System.out.println(" jsem ředitel");
    }
}
