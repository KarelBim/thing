package Dedicnost_4;

import java.util.ArrayList;

public class Main {
    static ArrayList<Nadoba> nadoby = new ArrayList<>();
    static Nadoba getNejvetsiNadoba(){
        Nadoba nejvetsi = new Nadoba("Neexistuje","neni");
        for(Nadoba n : nadoby){
            if(n.vypocetObjemu() > nejvetsi.vypocetObjemu()){
                nejvetsi = n;
            }
        }
        return nejvetsi;
    }
    public static void main(String[] args) {
        nadoby.add(new Hrnecek(5,10,"porcelán","Čaj"));
        nadoby.add(new Hrnec("nerez",15,20,true));
        nadoby.add(new Hrnec("porcelán",1,50,false));
        nadoby.add(new Talir("Hluboký","porcelán",10));
        System.out.println("informace o nádobě s největším objemem: " + getNejvetsiNadoba().getInfo());
    }
}
