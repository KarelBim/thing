package Domov;

import java.util.Scanner;

public class Dum {
    static Mistnost[] mistnost = new Mistnost[3];
    static Scanner sc = new Scanner(System.in);
    static void vypsatMistnosti(){
        for(Mistnost mistnost : mistnost){
            mistnost.popis();
        }
    }
    static int getNum(){
        int num;
        try{
            num = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Musí být celé číslo");
            sc.nextLine();
            return getNum();
        }
        return num;
    }
    static void akce(int akce){
        switch (akce){

        }
    }
    public static void main(String[] args) {
        mistnost[0] = new Loznice();
        mistnost[1] = new Koupelna();
        mistnost[2] = new Kuchyn();
        while(true){
            System.out.println("Co chcete podniknout: ");
            System.out.println("1 - zobrazit místnosti");
            System.out.println("2 - přidat nábytek");
            System.out.println("3 - ukončit program");
            akce(getNum());
        }
    }
}
