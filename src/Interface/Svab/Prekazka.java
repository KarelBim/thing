package Interface.Svab;

import java.util.ArrayList;

public class Prekazka {
    private String jmeno;
    private int sirkaSkviry;
    private int jedovatos;
    private int intezitaSvetla;
    private int zbytkyJidla;
    private boolean lepivaPodlaha;
    private ArrayList<Svab> skoncovaniSvaby = new ArrayList<>();
    public Prekazka(String jmeno,int sirkaSkviry,int jedovatos, int intezitaSvetla, int zbytkyJidla, boolean lepivaPodlaha) {
        if(sirkaSkviry<1 || sirkaSkviry>5){
            sirkaSkviry=1;
        }
        if(jedovatos<0 || jedovatos>100){
            jedovatos=0;
        }
        if(intezitaSvetla < 0 || intezitaSvetla>100){
            intezitaSvetla=0;
        }
        if(zbytkyJidla<0|| zbytkyJidla>20){
            zbytkyJidla=0;
        }
        this.sirkaSkviry=sirkaSkviry;
        this.jedovatos=jedovatos;
        this.intezitaSvetla=intezitaSvetla;
        this.zbytkyJidla=zbytkyJidla;
        this.lepivaPodlaha=lepivaPodlaha;
        this.jmeno=jmeno;
    }
    public String getJmeno() {
        return jmeno;
    }
    public int getSirkaSkviry(){return sirkaSkviry;}
    public int getJedovatos(){return jedovatos;}
    public int getIntezitaSvetla(){return intezitaSvetla;}
    public int getZbytkyJidla(int pocet){
        if(zbytkyJidla - pocet<0){
            int pomoc = zbytkyJidla;
            zbytkyJidla = 0;
            return pomoc;
        }
        else if(zbytkyJidla == 0){
            return 0;
        }
        zbytkyJidla -= pocet;
        return pocet;
    }
    public void addSkonanySvab(Svab svab){
        skoncovaniSvaby.add(svab);
    }
    public ArrayList<Svab> getSkoncovaniSvaby(){return skoncovaniSvaby;}
    public boolean getLepivaPodlaha(){return lepivaPodlaha;}
}
