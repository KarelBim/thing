package Pekarna;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] typRohliku = {"makový","celozrný","slaný","bez posypu"};
        String[] typMouky = {"Pšeničná","žitná","celozrnná"};
        ArrayList<Pecivo> peciva = new ArrayList<>();
        Random r = new Random();
        peciva.add(new Rohlik("Rohlíček",r.nextDouble(2,10),r.nextDouble(50,250),r.nextDouble(0,10),typRohliku[r.nextInt(typRohliku.length)]));
        peciva.add(new Rohlik("Pšenic",r.nextDouble(2,12),r.nextDouble(50,250),r.nextDouble(0,10),typRohliku[r.nextInt(typRohliku.length)]));
        peciva.add(new Rohlik("Polo",r.nextDouble(1,12),r.nextDouble(50,250),r.nextDouble(0,10),typRohliku[r.nextInt(typRohliku.length)]));
        peciva.add(new Chleba("Chlebík",r.nextDouble(10,30),r.nextDouble(50,300),r.nextDouble(0,10),r.nextInt(100),typMouky[r.nextInt(typMouky.length)]));
    }
}
