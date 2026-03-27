package Dedicnost_4;

public class Teropod extends Dinosaur{
    private double velikostZubu;
    public Teropod(String jmeno, String druh,int vek, double velikost) {
        super(jmeno, druh, vek);
        this.velikostZubu = velikost;
    }
    public void vratPopis(){
        super.vratPopis();
        System.out.println();
    }
    public void vratPopis(boolean b){
        super.vratPopis();
        System.out.println(", velikost zubu: " + velikostZubu);
    }
}
