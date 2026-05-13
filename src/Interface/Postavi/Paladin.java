package Interface.Postavi;

public class Paladin extends Postava implements IUtocnik,ILecitel{
    public Paladin(String jmeno, int zivoty){
        super(jmeno, zivoty);
    }
    public int leci(){
        return 10;
    }
    public int utoc(){
        return 10;
    }
    public String pohyb(){
        return getJmeno() + " se pohybuje pomalu";
    }
}
