package Interface.Svab;

public class Svab {
    protected String jmeno;
    protected int energie;
    protected int pocetProjitychPrekazek;
    protected boolean nazivu;
    public Svab(String jmeno, int energie) {
        this.jmeno = jmeno;
        if (energie < 0 || energie > 100) {
            energie = 50;
        }
        this.energie = energie;
        this.nazivu = true;
    }
    public boolean jeNazivu(){
        if(energie <= 0){
            energie = 0;
            nazivu = false;
            return false;
        }
        return true;
    }
    public String getJmeno() {
        return jmeno;
    }
    public int getEnergie() {
        return energie;
    }
    public int getPocetProjitychPrekazek(){
        return pocetProjitychPrekazek;
    }
    public void vypisStav(){
        if(nazivu){
            System.out.println("Šváb " + jmeno + " Energie: " + energie);
        }
        else{
            System.out.println("Šváb " + jmeno + " selhal útěk");
        }
    }
}
