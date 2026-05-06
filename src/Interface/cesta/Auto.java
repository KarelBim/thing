package Interface.cesta;

public class Auto implements ITransport{
    private boolean poDalnici;
    private String typMyta;
    private int vzdalenostJizdy;
    public Auto(boolean poDalnici, String typMyta) {
        this.poDalnici = poDalnici;
        this.typMyta = typMyta;
        this.vzdalenostJizdy = 100;
    }
    public Auto(boolean poDalnici) {
        if (poDalnici) {
            this.poDalnici = false;
        }
        this.poDalnici = poDalnici;
        this.vzdalenostJizdy = 100;
    }
    public void pohyb(){
        System.out.print("Auto jede ");
        if (poDalnici) {
            System.out.print("po dálnici s" + typMyta);
        }
        else{
            System.out.println();
        }

    }
    public void zastaveni(){
        System.out.println("Auto ujelo " + vzdalenostJizdy);
    }
}
