package Interface.Ukollysd;

public class Paddleboard extends Vylet implements IVodni,IPocasiZavisla{
    private String[] vhodnePocasi;
    public Paddleboard(String nazev,int delkaMinuty,int maxPocetOsob,double cenaZaOsobu){
        super(nazev,delkaMinuty,maxPocetOsob,cenaZaOsobu);
        vhodnePocasi = new String[] {"Slunečno", "Zataženo", "Oblačno"};
    }
    public String vratDoporuceneVybaveni(){
        return "Paddleboard, plavky";
    }
    public boolean lzeProvozovat(String pocasi){
        for(String Pocasi : vhodnePocasi){
            if(Pocasi.equalsIgnoreCase(pocasi)){
                return true;
            }
        }
        return false;
    }
}
