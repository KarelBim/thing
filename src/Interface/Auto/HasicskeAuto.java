package Interface.Auto;

public class HasicskeAuto implements IZasahoveVozidlo{
    private String znacka;
    private int mnozstviVody;
    public HasicskeAuto(String znacka, int mnozstviVody) {
        this.znacka = znacka;
        this.mnozstviVody = mnozstviVody;
    }
    public void vyjezd(){
        System.out.println("Hasičské "+znacka +" auto vyjelo");
    }
    public void provedZasah(){
        System.out.println("Hasičské "+znacka +" auto provedlo zásah");
    }
    public void vratSe(){
        System.out.println("Hasičské "+znacka +" auto se vrátilo");
    }
}
