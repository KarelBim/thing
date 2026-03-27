package Dedicnost_4;

public class Dinosaur {
    private String jmeno, druh;
    private int vek;
    public Dinosaur(String jmeno, String druh, int vek) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
    }
    public void vratPopis(){
        System.out.print("Jmeno: " + jmeno + ", druh: " + druh + ", věk: " + vek);
    }
}
