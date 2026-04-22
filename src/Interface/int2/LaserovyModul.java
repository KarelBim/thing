package Interface.int2;

public class LaserovyModul implements IAktivovatelny{
    private int energie;
    private int teplota;
    public LaserovyModul(int energie, int teplota) {
        this.energie = energie;
        this.teplota = teplota;
    }
    public boolean aktivuj(){
        if(energie >= 25 && teplota <= 70){
            energie-=25;
            teplota+=15;
            return true;
        }
        return false;
    }
    public void vypisStav(){
        System.out.println("Stav modulu Energie: " + energie + " teplota: " + teplota);
    }
}
