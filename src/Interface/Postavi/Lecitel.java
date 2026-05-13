package Interface.Postavi;

public class Lecitel extends Postava implements ILecitel{
    public Lecitel(String jmeno, int zivoty){
        super(jmeno, zivoty);
    }
    public int leci(){
        return 20;
    }
    public String pohyb(){
        return getJmeno() + " se plíží";
    }
}
