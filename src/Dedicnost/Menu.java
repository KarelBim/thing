package Dedicnost;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ZavodniVozidlo> vozidla = new ArrayList<>();
    static void vypsatVozidla(){
        for(ZavodniVozidlo voz : vozidla){
            voz.info();
        }
    }
    static void zavod(){
        for(ZavodniVozidlo voz : vozidla){
            System.out.println(voz.zavod());
        }
    }
    static void rychlostVyssi(int rychlost){
        System.out.println("Vozidla s rychlostí " + rychlost + " a více");
        for(ZavodniVozidlo voz : vozidla){
            if(rychlost <= voz.getMaxRychlost()){
                voz.info();
            }
        }
    }
    static void nejrychlejsiVozidlo(){
        int maxRychlost = Integer.MIN_VALUE;
        ZavodniVozidlo Nejvoz = null;
        for(ZavodniVozidlo voz : vozidla){
            if(maxRychlost < voz.getMaxRychlost()){
                Nejvoz = voz;
            }
        }
        System.out.println("nejRychleší vozidlo: ");
        Nejvoz.info();

    }
    static void prumerRychlost(){
        int celkem = 0;
        for(ZavodniVozidlo voz : vozidla){
            celkem += voz.getMaxRychlost();
        }
        System.out.println("Průměrná rychlost: " + (double)celkem/vozidla.size());
    }
    static void getColorVehicle(String color){
        System.out.println("Vozidla s " + color);
        for(ZavodniVozidlo voz : vozidla){
            if(color.equalsIgnoreCase(voz.getBarva())) {
                voz.info();
            }
        }
    }
    public static void main(String[] args) {
        vozidla.add(new Auto("Fabia","Červená",150,4));
        vozidla.add(new Motorka("Super","Černá",260,5));
        vozidla.add(new MonsterTruck("Monster","Žlutá",100,100));
        vozidla.add(new Auto("Dacia","Šedivá",300,2));
        vozidla.add(new MonsterTruck("Mon","Oranžová",1000,300));
        vypsatVozidla();
        zavod();
        nejrychlejsiVozidlo();
        getColorVehicle("červená");
        prumerRychlost();
        rychlostVyssi(200);
    }
}
