package Interface.cesta;

public class Letadlo implements ITransport{
    private String trida;
    private int vzdalenostJizdy;
    public Letadlo(String trida) {
        this.trida = trida;
        this.vzdalenostJizdy = 1000;
    }
    public void pohyb(){
        System.out.println("Letadlo letí, sedíte v " + trida + " třídě");
    }
    public void zastaveni(){
        System.out.println("Letadlo uletělo " + vzdalenostJizdy);
    }
}
