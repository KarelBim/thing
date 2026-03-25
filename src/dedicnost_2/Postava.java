package dedicnost_2;

public class Postava {
    private String name;
    private int life;
    private int lvl;
    public Postava(String name, int life, int lvl) {
        this.name = name;
        this.life = life;
        this.lvl = lvl;
    }
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getLvl() {
        return lvl;
    }
    public void utoc(){
        System.out.println("Utok");
    }
    public boolean jePostavaSilna(){
        return lvl > 10 || life > 100;
    }
    public void vypisInfo(){
        System.out.print( "Jméno "+getName()+ " počet životů: " + getLife() + " úroveň: " + getLvl());

    }
}
