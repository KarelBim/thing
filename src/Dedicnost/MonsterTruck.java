package Dedicnost;

public class MonsterTruck extends ZavodniVozidlo{
    private double prumerKol;
    public MonsterTruck(String znacka,String barva,int maxRychlost,double prumerKol) {
        super(znacka,barva,maxRychlost);
        this.prumerKol = prumerKol;
    }
    public String getInfo(){
        return super.getInfo()+" "+prumerKol;
    }
    public double getPrumerKol() {
        return prumerKol;
    }
    public void info(){
        super.info();
        System.out.println(" průměr kol: "+prumerKol);
    }
    public String zavod(){
        return getZnacka()+" se valí zatáčkou";
    }
}
