package Interface.int4;

import Interface.int2.IAktivovatelny;

import java.util.Random;

public class Main {
    public boolean vsichniNaZivu(IBojovnik[] bojovnici) {
        int pocet = 0;
        for (IBojovnik p : bojovnici) {
            if (p.jeNazivu()) {
                pocet++;
            }
        }
        return pocet>1;
    }
    public static void main(String[] args) {
        Main m = new Main();
        IBojovnik[] bojovnici = new IBojovnik[3];
        bojovnici[0] = new Carodej("Bonifác",100,50);
        bojovnici[1] = new Lukostrelec("Rob",75,10);
        bojovnici[2] = new Rytir("Metoděj",150,5);
        Random rand = new Random();
        while(m.vsichniNaZivu(bojovnici)){
            for(int i=0;i<bojovnici.length;i++){
                int bojovnik = i;
                while (bojovnik == i) {
                    bojovnik = rand.nextInt(bojovnici.length);
                }
                System.out.println(((Postava) bojovnici[i]).getJmeno() + " útočí se "+ ((Postava) bojovnici[i]).getUtok() +" silou na " );
                bojovnici[bojovnik].primiZasah(bojovnici[i].utoc());
                bojovnici[bojovnik].vypisStav();
                System.out.println();
            }
        }
        System.out.println("výherce:");
        for(IBojovnik p : bojovnici){
            if(p.jeNazivu()){
                p.vypisStav();
            }
        }
    }
}

