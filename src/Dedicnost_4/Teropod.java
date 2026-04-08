package Dedicnost_4;

public class Teropod extends Dinosaur{
    private double velikostZubu;
    public Teropod(String jmeno, String druh,int vek, double velikost) {
        super(jmeno, druh, vek);
        this.velikostZubu = velikost;
    }
    public void vratPopis(boolean b){
        if(b) {
            super.vratPopis();
            System.out.println(", velikost zubu: " + velikostZubu);
        }
        else{
            super.vratPopis();
            System.out.println();
        }
    }
}
