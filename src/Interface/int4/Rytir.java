package Interface.int4;

public class Rytir extends Postava implements IBojovnik{
    private int brneni;
    public Rytir(String jmeno,int zivoty,int brneni){
        super(jmeno,zivoty,15);
        this.brneni=brneni;
    }
    public boolean jeNazivu(){
        return zivoty > 0;
    }
    public void vypisStav(){
        if(jeNazivu()){
            System.out.println("Rytíř " + getJmeno() + " Životy: " + getZivoty());
        }
        else{
            System.out.println("Rytíř " + getJmeno() + " není na živu");
        }
    }
    public int utoc(){
        return getUtok();
    }
    public void primiZasah(int utok){
        if(utok-brneni > 0){
            zivoty-=utok-brneni;
        }
    }
}
