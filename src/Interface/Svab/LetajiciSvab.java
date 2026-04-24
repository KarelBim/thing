package Interface.Svab;

public class LetajiciSvab extends Svab implements ISvab{
    public LetajiciSvab(String jmeno, int energie) {
        super(jmeno, energie);
    }
    public boolean muzeProjit(Prekazka p) {
        return (nazivu && p.getSirkaSkviry() >= 2 && p.getJedovatos() <= 45 && p.getIntezitaSvetla() <= 85 && energie >= 15);
    }
    public void projdiPrekazku(Prekazka p) {
        energie -= 12;
        energie += p.getZbytkyJidla(3);
        if(p.getIntezitaSvetla() > 60){
            energie -= 8;
        }
        if(jeNazivu()){
            pocetProjitychPrekazek++;
        }
    }
}
