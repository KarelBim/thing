package Interface.Prostredky;

public class Auto extends DopravniProstredek implements ISpotrebaPaliva{
    private int spotreba;
    public Auto(String jmeno,int spotreba){
        super(jmeno);
        this.spotreba = spotreba;
    }
    public String Pohyb(){
        return "Auto " + getJmeno() + " jede po čtyřech kolech";
    }
    public int spotreba(){
        return spotreba;
    }
}
