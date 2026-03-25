package Dedicnost_3;

public class Zak extends Osoba{
    private String obor;
    private double prumer;
    public Zak(String name,int age,String obor,double prumer) {
        super(name,age);
        this.obor = obor;
        this.prumer = prumer;
    }
    public String getObor() {
        return obor;
    }
    public double getPrumer() {
        return prumer;
    }
    public boolean maVyznamenani(){
        return this.prumer <= 1.5;
    }
    public void predstavSe(){
        super.predstavSe();
        System.out.println(" jsem žák");
    }

}
