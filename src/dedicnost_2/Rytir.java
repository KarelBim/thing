package dedicnost_2;

public class Rytir extends Postava{
    private int silaBrneni;
    public Rytir(String name,int life,int lvl,int silaBrneni) {
        super(name,life,lvl);
        this.silaBrneni = silaBrneni;
    }
    public int getSilaBrneni() {
        return silaBrneni;
    }
    public void utoc(){
        System.out.println("Rytíř se ohání mečem");
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println(" silaBrneni: " + silaBrneni);
    }
}
