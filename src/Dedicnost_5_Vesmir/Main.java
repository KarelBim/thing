package Dedicnost_5_Vesmir;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Planeta> planety = new ArrayList<>();
        Planeta nejvetsi = null;
        planety.add(new Planeta("Jupiter","Plynná",139820,"hustá"));
        planety.add(new Planeta("Mars","rudá",6779,"řidká"));
        planety.add(new Planeta("Merkur","skalnatá",4879.4,"extrémně řidká"));
        planety.add(new Planeta("Venuše","kamenitá",12104,"extrémně hustá"));
        for (Planeta planeta : planety) {
            if(nejvetsi == null || nejvetsi.getPrumer() < planeta.getPrumer()) {
                nejvetsi = planeta;
            }
        }
        System.out.println("Největší planeta:");
        nejvetsi.vypisInfo();
    }
}
