package PohadkovaPostava;

import java.util.Random;
import java.util.Scanner;

public class Pohadka {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        PohadkovaPostava[] pohadkovePostavy = new PohadkovaPostava[4];
        for (int i = 0; i < pohadkovePostavy.length-1; i++) {
            System.out.println("Pojmenujte princeznu: ");
            pohadkovePostavy[i] = new Princezna(sc.nextLine(),rand.nextInt(0,20) + 1);
            ((Princezna) pohadkovePostavy[i]).spokojenaSJmenem();
        }
        pohadkovePostavy[3] = new Drak("Bonifác",5);
        PohadkovaPostava nejstarsi = null;
        for( PohadkovaPostava p : pohadkovePostavy ) {
            if(nejstarsi == null){
                nejstarsi = p;
            }
            else if(nejstarsi.getVek() < p.getVek()){
                nejstarsi = p;
            }
        }
        nejstarsi.popis();
    }
}
