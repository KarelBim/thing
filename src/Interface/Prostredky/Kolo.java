package Interface.Prostredky;

public class Kolo extends DopravniProstredek{
    public Kolo(String jmeno){
        super(jmeno);
    }
    public String pohyb(){
        return "Kolo " + getJmeno() + " jede po dvou kolech";
    }
}
