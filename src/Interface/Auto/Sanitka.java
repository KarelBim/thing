package Interface.Auto;

public class Sanitka implements IZasahoveVozidlo {
    private String znacka;
    private int pocetNositek;
    public Sanitka(String znacka, int pocetNositek) {
        this.znacka = znacka;
        this.pocetNositek = pocetNositek;
    }
    public void vyjezd(){
        System.out.println("Sanitka "+znacka +" vyjelo");
    }
    public void provedZasah(){
        System.out.println("Sanitka "+znacka +" provedlo zásah");
    }
    public void vratSe(){
        System.out.println("Sanitka "+znacka +" se vrátilo");
    }
}
