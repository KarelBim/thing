package Interface.Auto;

import java.util.ArrayList;

public class main {
    public void obsluzVozidlo(IZasahoveVozidlo vozidlo){
        vozidlo.vyjezd();
        vozidlo.provedZasah();
        vozidlo.vratSe();
    }
    public static void main(String[] args) {
        main m = new main();
        ArrayList<IZasahoveVozidlo> vozidla = new ArrayList<>();
        vozidla.add(new HasicskeAuto("asdasd5",12));
        vozidla.add(new Sanitka("psd04",14));
        vozidla.add(new PolicejniVuz("pasdassd05",15));
        for(IZasahoveVozidlo vozidlo : vozidla){
            m.obsluzVozidlo(vozidlo);
        }
    }
}
