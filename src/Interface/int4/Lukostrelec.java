package Interface.int4;

public class Lukostrelec extends Postava implements IBojovnik {
    private int pocetSipu;
    private int pocetUtoku;
    public Lukostrelec(String jmeno,int zivoty,int pocetSipu) {
        super(jmeno,zivoty,12);
        this.pocetSipu=pocetSipu;
    }
    public void primiZasah(int utok){
        zivoty-=utok;
    }
    public boolean jeNazivu(){
        return zivoty > 0;
    }
    public int utoc(){
        if(pocetSipu<0){
            return 0;
        }
        pocetUtoku++;
        pocetSipu--;
        if(pocetUtoku%3==0){
            return 20;
        }
        return utok;
    }
    public void vypisStav(){
        if(jeNazivu()){
            System.out.println("Lukostřelec " + getJmeno() + " Životy: " + getZivoty() + " počet šípů: " + pocetSipu);
        }
        else{
            System.out.println("Lukostřelec " + getJmeno() + " není na živu");
        }
    }
}
