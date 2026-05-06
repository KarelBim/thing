package Interface.cesta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ITransport> luxus = new ArrayList<>();
        luxus.add(new Letadlo("První třída"));
        luxus.add(new Vlak(true,25));
        luxus.add(new Vlak(true,14));
        luxus.add(new Lod(true,452));

        ArrayList<ITransport> standart = new ArrayList<>();
        standart.add(new Auto(true,"dálniční známka"));
        standart.add(new Auto(true,"dálniční známka"));
        standart.add(new Auto(false));
        standart.add(new Auto(false));
        standart.add(new Auto(false));
        standart.add(new Auto(false));
        standart.add(new Lod(false));

        ArrayList<ITransport> nizkoNakladove = new ArrayList<>();
        nizkoNakladove.add(new Letadlo("turistická třída"));
        nizkoNakladove.add(new Letadlo("turistická třída"));
        ArrayList<ArrayList<ITransport>> cesty = new ArrayList<>();

        cesty.add(nizkoNakladove);
        cesty.add(standart);
        cesty.add(luxus);

        for (ArrayList<ITransport> cesta : cesty) {
            for (ITransport t : cesta) {
                t.pohyb();
                t.zastaveni();
            }
            System.out.println("Jsme v Palermu");
            System.out.println();
        }

    }
}
