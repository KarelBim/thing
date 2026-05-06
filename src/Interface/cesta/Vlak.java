package Interface.cesta;

public class Vlak implements ITransport{
    private boolean mistenka;
    private int cisloSedadla;
    private int vzdalenostJizdy;
    public Vlak(boolean mistenka, int cisloSedadla) {
        this.mistenka = mistenka;
        this.cisloSedadla = cisloSedadla;
        this.vzdalenostJizdy = 250;
    }
    public Vlak(boolean mistenka) {
        if (mistenka) {
            this.mistenka = false;
        }
        this.mistenka = mistenka;
        this.vzdalenostJizdy = 250;
    }
    public void pohyb(){
        System.out.print("vlak jede");
        if (mistenka) {
            System.out.println(", jedete v sedadle č. " + cisloSedadla);
        }
    }
    public void zastaveni(){
        System.out.println("Vlak ujel " + vzdalenostJizdy);
    }
}
