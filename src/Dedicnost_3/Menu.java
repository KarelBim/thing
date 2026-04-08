package Dedicnost_3;

import java.util.ArrayList;

public class Menu {
    static ArrayList<Osoba> osoby = new ArrayList<>();
    static void vypsat(){
        for(Osoba osoba : osoby){
            osoba.predstavSe();
        }
    }
    static void nejZak(){
        Osoba o = null;
        for(Osoba osoba : osoby){
            if(o == null || o.getPrumer() > osoba.getPrumer()){
                o = osoba;
            }
        }
        System.out.println(o);
    }
    static void osobyStarsi(int age){
        for(Osoba osoba : osoby){
            if(osoba.getAge() >= age){
                osoba.vypisInfo();
            }
        }
    }
    public static void main(String[] args) {
        osoby.add(new Skolnik("Jaromír",53,true));
        osoby.add(new Reditel("Bohumil",68,12));
        osoby.add(new Ucitel("Hana",43,"Tělocvik","5 A"));
        osoby.add(new Zak("Adam" ,17,"IT",1.4));
        osoby.add(new Zak("Bob" ,16,"Economika",4.2));
        osoby.add(new Zak("Pepa", 21,"Lycelium",3));
        vypsat();
        nejZak();
        osobyStarsi(30);
    }
}
