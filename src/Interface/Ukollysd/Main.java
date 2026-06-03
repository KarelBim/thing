package Interface.Ukollysd;

import Interface.Auto.IZasahoveVozidlo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public double getCisloDouble(){
        double cislo = 0;
        try{
            cislo = Double.parseDouble(sc.nextLine());
            if(cislo < 0){
                System.out.println("Cislo nemůže být záporné");
                cislo = getCislo();
            }
        }catch(Exception e){
            System.out.println("Musí být celé kladné číslo");
            cislo = getCislo();
        }
        return cislo;
    }
    public int getCislo(int maxRozsah){
        int cislo = 0;
        try{
            cislo = Integer.parseInt(sc.nextLine());
            if(cislo < 0 || cislo > maxRozsah){
                System.out.println("Cislo musí být platné");
                cislo = getCislo(maxRozsah);
            }
        }catch(Exception e){
            System.out.println("Musí být celé kladné číslo");
            cislo = getCislo();
        }
        return cislo;
    }
    public int getCislo(){
        return (getCislo(Integer.MAX_VALUE));
    }
    public void pridatAktivity(ArrayList<Aktivita> aktivity, double rozpocet,int pocetOsob,int pocetVolnehoCasu,String aktualniPocasi,ArrayList<Aktivita> denAktivit){
        for(Aktivita aktivita : aktivity){
            if(pocetVolnehoCasu - aktivita.getDelkaMinuty() < 0){
                break;
            }
            if(aktivita instanceof IPocasiZavisla){
                if(!((IPocasiZavisla) aktivita).lzeProvozovat(aktualniPocasi)){
                    break;
                }
            }
            if(aktivita.getMaxPocetOsob() - pocetOsob < 0){
                break;
            }
            if(aktivita instanceof IPlacena){
                if(rozpocet - ((IPlacena) aktivita).getCena(pocetOsob) < 0){
                    rozpocet -= ((IPlacena) aktivita).getCena(pocetOsob);
                }
            }
            pocetVolnehoCasu -= aktivita.getDelkaMinuty();
            denAktivit.add(aktivita);
        }
    }
    public static void main(String[] args) {
        ArrayList<Aktivita> aktivity = new ArrayList<>();
        Main m = new Main();
        aktivity.add(new Aktivita("Opalování na pláži",120,20));
        aktivity.add(new Vylet("Výlet lodí",90,12,250));
        aktivity.add(new JogaNaPlazi("Ranní jóga na pláži",45,10));
        aktivity.add(new Paddleboard("Paddleboard",90,6,200));
        aktivity.add(new RodinnyVylet("Jízda řekou",60,5,150));
        aktivity.add(new RodinnyVylet("Malování mušlí",45,8,50));
        aktivity.add(new JogaNaPlazi("Procházka parkem", 30,4));
        aktivity.add(new Vylet("Výlet letadlem",75,2,450));

        ArrayList<Aktivita> prazdninovyDenAktivit = new ArrayList<>();
        int casCelkem = 0;
        double cenaCelkem = 0;
        System.out.print("Vypište rozpočet: ");
        double rozpocet = m.getCisloDouble();
        System.out.print("Volný čas v minutách: ");
        int pocetVolnehoCasu = m.getCislo();
        System.out.print("Počasí:");
        String aktualniPocasi = sc.nextLine();
        System.out.print("Jedou děti (1 - ano ,0 - ne): ");
        boolean deti = (m.getCislo(1) == 1);
        System.out.print("Kolik lidí jede: ");
        int pocetOsob = m.getCislo();
        if(deti){
            for(Aktivita aktivita : aktivity){
                if(aktivita instanceof IVhodneProDeti){
                    if(!(pocetVolnehoCasu - aktivita.getDelkaMinuty() < 0)){
                        if(aktivita instanceof IPocasiZavisla){
                            if(((IPocasiZavisla) aktivita).lzeProvozovat(aktualniPocasi)){
                                if(aktivita.getMaxPocetOsob() - pocetOsob < 0){
                                    if(aktivita instanceof IPlacena){
                                        if(rozpocet - ((IPlacena) aktivita).getCena(pocetOsob) < 0){
                                            rozpocet -= ((IPlacena) aktivita).getCena(pocetOsob);
                                        }
                                    }
                                    pocetVolnehoCasu -= aktivita.getDelkaMinuty();
                                    prazdninovyDenAktivit.add(aktivita);
                                }
                            }
                        }
                    }
                }
            }
            for(Aktivita aktivita : aktivity){
                        if(!(pocetVolnehoCasu - aktivita.getDelkaMinuty() < 0)){
                            if(aktivita instanceof IPocasiZavisla){
                                if(((IPocasiZavisla) aktivita).lzeProvozovat(aktualniPocasi)){
                                    if(aktivita.getMaxPocetOsob() - pocetOsob < 0){
                                        if(aktivita instanceof IPlacena){
                                            if(rozpocet - ((IPlacena) aktivita).getCena(pocetOsob) < 0){
                                                rozpocet -= ((IPlacena) aktivita).getCena(pocetOsob);
                                            }
                                        }
                                        pocetVolnehoCasu -= aktivita.getDelkaMinuty();
                                        prazdninovyDenAktivit.add(aktivita);
                                    }
                                }
                            }
                        }
        }
        else{
            m.pridatAktivity(aktivity,rozpocet,pocetOsob,pocetVolnehoCasu,aktualniPocasi,prazdninovyDenAktivit);
        }
        for(Aktivita aktivita : prazdninovyDenAktivit) {
            aktivita.popis();
            casCelkem += aktivita.getDelkaMinuty();
            if(aktivita instanceof IPlacena){
                cenaCelkem += ((IPlacena) aktivita).getCena(pocetOsob);
            }
        }
        System.out.println("Celkový čas: " + casCelkem);
        System.out.println("Celková cena: " + cenaCelkem);
        System.out.println("Zbytek: " + rozpocet);
    }
}
