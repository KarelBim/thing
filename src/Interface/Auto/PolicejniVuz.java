package Interface.Auto;

public class PolicejniVuz implements IZasahoveVozidlo{
    private String znacka;
    private int pocetMajaku;
    public PolicejniVuz(String znacka, int pocetMajaku) {
        this.znacka = znacka;
        this.pocetMajaku = pocetMajaku;
    }
    public void vyjezd(){
        System.out.println("Police auto "+znacka +" vyjelo");
    }
    public void provedZasah(){
        System.out.println("Police auto "+znacka +" provedlo zásah");
    }
    public void vratSe(){
        System.out.println("Police auto "+znacka +" se vrátilo");
    }
}
