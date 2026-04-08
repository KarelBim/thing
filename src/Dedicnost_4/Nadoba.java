package Dedicnost_4;

public class Nadoba {
    private final String typ;
    private String material;
    public Nadoba(String typ, String material) {
        this.typ = typ;
        this.material = material;
    }
    public double vypocetObjemu(){
        return 0;
    }
    public String getInfo(){
        return "Typ: " + typ + " Material: " + material ;
    }
}
