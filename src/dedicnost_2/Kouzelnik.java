package dedicnost_2;

public class Kouzelnik extends Postava{
    private int mana;
    public Kouzelnik(String name,int life,int lvl,int mana){
        super(name,life,lvl);
        this.mana=mana;
    }
    public int getMana() {
        return mana;
    }
    public void utoc(){
        System.out.println("Kouzelník sesílá ohnivou kouli");
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println(" mana: " + mana);
    }
}
