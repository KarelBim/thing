package Dedicnost_6;

public class SpravaDopravy {
    public static void main(String[] args) {
        Vlak vlaky[] = new Vlak[3];
        vlaky[0] = new OsobniVlak("České dráhy");
        vlaky[1] = new NakladniVlak("Náklaďák", "Dříví");
        vlaky[2] = new OsobniVlak("Tygr");
        for (Vlak v : vlaky) {
            v.spustit();
            if (v instanceof NakladniVlak) {
                ((NakladniVlak) v).vylozitNaklad();
            }
            else{
                ((OsobniVlak)v).zastavitSe();
            }
        }
        for(int i= vlaky.length-1; i>= 0; i--){
            vlaky[i].spustit();
        }
    }
}

