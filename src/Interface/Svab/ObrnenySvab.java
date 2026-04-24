package Interface.Svab;

public class ObrnenySvab extends Svab implements ISvab{
    public ObrnenySvab(String jmeno,int energie){
        super(jmeno, energie);
    }
    public boolean muzeProjit(Prekazka p){
        return(nazivu && p.getSirkaSkviry() >= 3 && p.getJedovatos() <= 80 && p.getIntezitaSvetla() <= 55);
    }
    public void projdiPrekazku(Prekazka p){
        energie -= 8;
        energie += p.getZbytkyJidla(6);
        if(p.getJedovatos()>50){
            energie -= 10;
        }
        if(jeNazivu()){
            pocetProjitychPrekazek++;
        }
    }
}
