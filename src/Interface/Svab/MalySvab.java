package Interface.Svab;

public class MalySvab extends Svab implements ISvab{
    public MalySvab(String jmeno,int energie) {
        super(jmeno, energie);
    }
    public boolean muzeProjit(Prekazka p) {
        if (p.getSirkaSkviry() >= 1 && p.getJedovatos() <= 30 && p.getIntezitaSvetla() <= 45 && nazivu){
            if (p.getLepivaPodlaha()){
                return (energie >= 20);
            }
            return true;
        }
        return false;
    }
    public void projdiPrekazku(Prekazka p) {
        energie -= 5;
        if(p.getLepivaPodlaha()){
            energie -= 5;
        }
        energie += p.getZbytkyJidla(4);
        if(!jeNazivu()){
            p.addSkonanySvab(this);
        }
        else{
            pocetProjitychPrekazek++;
        }
    }
}
