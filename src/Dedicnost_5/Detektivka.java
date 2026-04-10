package Dedicnost_5;

public class Detektivka extends Kniha{
    private String jmenoHPostavy;
    private String zeme;
    public Detektivka(Autor autor,String nazev,int rokVydani,double cena, String jmenoHPostavy, String zeme,int id) {
        super(autor,nazev,rokVydani,cena,id);
        this.jmenoHPostavy = jmenoHPostavy;
        this.zeme = zeme;
    }
    public void vypisInfo(int typUzivatele){
        super.vypisInfo(typUzivatele);
        System.out.println("Detektiv: " + jmenoHPostavy + " Destinace: " + zeme);
    }
    public void vypisInfo(int typUzivatele,boolean t){
        super.vypisInfo(typUzivatele);
        System.out.println();
    }
}
