package Interface.cesta;

public class Lod implements ITransport{
    private boolean bar;
    private int pocetBaru;
    private int vzdalenostJizdy;
    public Lod(boolean bar, int pocetBaru) {
        this.bar = bar;
        this.pocetBaru = pocetBaru;
        this.vzdalenostJizdy = 500;
    }
    public Lod(boolean bar) {
        if (bar) {
            this.bar = false;
        }
        this.bar = bar;
        this.vzdalenostJizdy = 500;
    }
    public void pohyb(){
        System.out.print("Loď plave");
        if (bar) {
            System.out.println(", je zde bar počet: " + pocetBaru);
        }
    }
    public void zastaveni(){
        System.out.println("Loď uplavala " + vzdalenostJizdy);
    }
}
