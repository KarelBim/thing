package Interface.int2;

public class Skenner implements IAktivovatelny{
    private int energie;
    private int silaSignalu;
    public Skenner(int energie, int silaSignalu) {
        this.energie = energie;
        this.silaSignalu = silaSignalu;
    }
    public boolean aktivuj(){
        if(energie >= 10 && silaSignalu >= 60){
            energie -= 10;
            return true;
        }
        return false;
    }
    public void vypisStav(){
        System.out.println("Stav Skenneru Energie: " + energie + " Sila signálu: " + silaSignalu);
    }
}
