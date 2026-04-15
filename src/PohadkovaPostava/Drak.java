package PohadkovaPostava;

public class Drak extends PohadkovaPostava{
    public Drak(String jmeno, int vek){
        super(jmeno, vek);
    }
    public int getDraciVek(){
        return getVek() * 3;
    }
    public void popis(){
        System.out.println("Jsem Drak " + getJmeno() + " a je mi " + getDraciVek() + " Dračích let");
    }

}
