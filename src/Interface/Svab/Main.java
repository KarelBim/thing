package Interface.Svab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prekazka> prekazky = new ArrayList<>();
        prekazky.add(new Prekazka("Ventilacni sachta", 3, 10, 20, 3, false));
        prekazky.add(new Prekazka("Lepiva kuchynka", 2, 15, 35, 6, true));
        prekazky.add(new Prekazka("Chemicky sklad", 4, 10, 25, 4, false));
        prekazky.add(new Prekazka("Nouzovy koridor", 3, 20, 75, 2, false));
        prekazky.add(new Prekazka("UV kontrolni brana", 2, 30, 90, 0, false));
        prekazky.add(new Prekazka("Odpadni potrubi", 1, 10, 15, 12, false));
        ArrayList<ISvab> svaby = new ArrayList<>();
        svaby.add(new MalySvab("Fero",35));
        svaby.add(new ObrnenySvab("Brutus",50));
        svaby.add(new LetajiciSvab("Turbo",40));
        for (ISvab svab : svaby) {
            for (Prekazka p : prekazky) {
                if(svab.muzeProjit(p)){
                    svab.projdiPrekazku(p);
                }
                else{
                    p.addSkonanySvab((Svab)svab);
                    if(svab.jeNazivu()){
                        System.out.println("Šváb se zasekl v " + p.getJmeno());
                    }
                    break;
                }
                svab.vypisStav();
            }
        }
        for (ISvab svab : svaby) {
            System.out.print("Šváb " + svab.getJmeno() + " energie: " + svab.getEnergie() + " překonal " + svab.getPocetProjitychPrekazek() + " překážek");
            if(svab.jeNazivu()){
                System.out.print(" je naživu");
            }
            else{
                System.out.print(" není naživu");
            }
            if(svab.getPocetProjitychPrekazek() == prekazky.size()){
                System.out.println(" Utekl z laboratoře");
            }
            else{
                System.out.println(" neutekl z laboratoře");
            }
        }
        for(Prekazka p : prekazky){
            ArrayList<Svab> svabyMrtve = p.getSkoncovaniSvaby();
            if(!svabyMrtve.isEmpty()){
                System.out.println("Na překážce " + p.getJmeno() + " skončily " + svabyMrtve.size() + " šváby:");
                for(Svab b : svabyMrtve){
                    System.out.println(b.getJmeno());
                }
            }
        }
    }
}
