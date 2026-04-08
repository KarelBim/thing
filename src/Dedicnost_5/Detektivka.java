package Dedicnost_5;

public class Detektivka extends Kniha{
    private String jmenoHPostavy;
    private String zeme;
    public Detektivka(Autor autor,String nazev,int rokVydani,double cena, String jmenoHPostavy, String zeme) {
        super(autor,nazev,rokVydani,cena);
        this.jmenoHPostavy = jmenoHPostavy;
        this.zeme = zeme;
    }
}
