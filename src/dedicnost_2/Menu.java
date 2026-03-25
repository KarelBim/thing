package dedicnost_2;

import java.util.ArrayList;

public class Menu {
    static ArrayList<Postava> postavy = new ArrayList<>();
    static void vypsat(){
        for(Postava p : postavy){
            p.vypisInfo();
        }
        System.out.println();
    }
    static void utoc(){
        for(Postava p : postavy){
            p.utoc();
        }
        System.out.println();
    }
    static void nejPocetZivotAUroven(){
        Postava urovenMax = null;
        Postava zivotMax = null;
        for(Postava p : postavy){
            if(urovenMax == null || urovenMax.getLvl() < p.getLvl()){
                urovenMax = p;
            }
            if(zivotMax == null || zivotMax.getLife() < p.getLife()){
                zivotMax = p;
            }
        }
        System.out.println("postava s největší úrovní: ");
        urovenMax.vypisInfo();
        System.out.println();
        System.out.println("postava s největším počtem životů");
        zivotMax.vypisInfo();
    }
    public static void main(String[] args) {
        postavy.add(new Kouzelnik("Gandalf",200,25,2500));
        postavy.add(new Kouzelnik("Pepa",10,1,2));
        postavy.add(new Rytir("Arthur",50,5,10));
        postavy.add(new Zlodej("Bořivoj",25,3,7));
        postavy.add(new Rytir("Metoděj",5800,10,50));
        vypsat();
        utoc();
        nejPocetZivotAUroven();
    }
}
