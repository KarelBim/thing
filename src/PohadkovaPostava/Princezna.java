package PohadkovaPostava;

import java.util.Random;
import java.util.Scanner;

public class Princezna extends PohadkovaPostava{
    public Princezna(String jmeno, int vek) {
        super(jmeno, vek);
    }
    public void popis(){
        System.out.println("Jsem princezna " + getJmeno() + " a je mi " + getVek() + " let");
    }
    public void zmenJmeno(String jmeno){
        setJmeno(jmeno);
    }
    public void zmenJmeno(String jmeno, String prijemni){
        setJmeno(jmeno + " " + prijemni);
    }
    public void spokojenaSJmenem(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(r.nextBoolean()){
            System.out.println("Princezna není spokojená s jménem vypiš jiné");
            zmenJmeno(sc.nextLine());
        }
    }
}
