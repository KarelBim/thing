package Dedicnost_4;

public class Sauropod extends Dinosaur{
    private double delkaKrkavice;
    public Sauropod(String jmeno, String druh,int vek,double delkaKrkavice){
        super(jmeno, druh,vek);
        this.delkaKrkavice = delkaKrkavice;
    }
    public void vratPopis(){
        super.vratPopis();
        System.out.println(", delka Krkavice: " + delkaKrkavice);
    }
}
