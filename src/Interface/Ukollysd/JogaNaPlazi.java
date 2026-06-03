package Interface.Ukollysd;

public class JogaNaPlazi extends Aktivita implements IRezervovatelna{
    public JogaNaPlazi(String nazev,int delkaMinuty,int maxPocetOsob){
        super(nazev,delkaMinuty,maxPocetOsob);
    }
    public boolean rezervovatelna(){
        return getMaxPocetOsob() - getPocetOsob() > 0;
    }
}
