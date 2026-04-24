package Interface.int4;

public class Carodej extends Postava implements IBojovnik{
    private int mana;
    public Carodej(String jmeno, int zivoty,int mana){
        super(jmeno,zivoty,8);
        this.mana=mana;
    }
    public boolean jeNazivu(){
        return zivoty > 0;
    }
    public int utoc(){
        if(mana >= 20){
            mana-=20;
            return 25;
        }
        mana+=5;
        return utok;
    }
    public void primiZasah(int utok){
        zivoty-=utok;
    }
    public void vypisStav(){
        if(jeNazivu()){
            System.out.println("Čaroděj " + getJmeno() + " Životy: " + getZivoty() + " Mana: " + mana);
        }
        else{
            System.out.println("Čaroděj " + getJmeno() + " není na živu");
        }
    }
}
