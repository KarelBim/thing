package Interface.Postavi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IPohyblivy> postavy = new ArrayList<>();
        postavy.add(new Postava("Vesničan",10));
        postavy.add(new Bojovnik("Thora",75));
        postavy.add(new Lecitel("Ema",45));
        postavy.add(new Paladin("Auruš",60));
        for (IPohyblivy postava : postavy) {
            System.out.println(postava.pohyb());
            if(postava instanceof IUtocnik){
                System.out.println("útok: "+((IUtocnik) postava).utoc());
            }
            if(postava instanceof ILecitel){
                System.out.println("léčení: " + ((ILecitel)postava).leci());
            }
            System.out.println();
        }
    }
}
