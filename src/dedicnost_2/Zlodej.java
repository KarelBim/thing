package dedicnost_2;

public class Zlodej extends Postava{
    private int obratnost;
    public Zlodej(String name,int life,int lvl, int obratnost) {
        super(name,life,lvl);
        this.obratnost=obratnost;
    }
    public int getObratnost() {
        return obratnost;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println(" obratnost: " + obratnost);
    }
    public void utoc(){
        System.out.println("Zloděj útočí ze stínu s dýkou");
    }
}
