package Interface.Prostredky;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IDopravniProstredek> prostredky = new ArrayList<>();
        prostredky.add(new Auto("Fabia",5));
        prostredky.add(new Auto("Dacia",2));
        prostredky.add(new Kolo("Rychlost"));
        for(IDopravniProstredek p : prostredky){
            System.out.println(p.pohyb());
            if(p instanceof ISpotrebaPaliva){
                System.out.println("Spotřeba na 100/km: "+((ISpotrebaPaliva)p).spotreba());
            }
            System.out.println();
        }
    }
}
