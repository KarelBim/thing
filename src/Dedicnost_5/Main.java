package Dedicnost_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kniha> knihy = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int getInt(){
        int n;
        try {
            n = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Neni platné číslo");
            sc.nextLine();
            return getInt();
        }
        return n;
    }
    static Kniha getKnihaFromID(int id) {
        for (Kniha kniha : knihy) {
            if(kniha.getId() == id) {
                return kniha;
            }
        }
        System.out.println("kniha neexistuje vypište jinou");
        return getKnihaFromID(getInt());
    }
    static void vypsatKnihu(Kniha kniha,int i){
        kniha.vypisInfo(i);
    }
    static void vypsatKnihu(Kniha kniha){
        kniha.vypisInfo();
    }
    static void vypsatKnihy(){
        for(int i = 0; i < knihy.size();i++){
            System.out.print(i + 1 + " ");
            Kniha k = knihy.get(i);
            k.vypisInfo();
        }
    }
    static int getUzivatel(int i){
        if(i < 0 || i > 2){
            System.out.println("Tento typ neexistuje zadejte jiný");
            return getUzivatel(getInt()-1);
        }
        else {
            return i;
        }
    }
    static Double celkemCena(ArrayList<Kniha> knihy, int uz){
        double celkem = 0;
        for (Kniha kniha : knihy) {
            celkem += kniha.getCena(uz);
        }
        return celkem;
    }
    static void vypsatKnihy(ArrayList<Kniha> kniha,int uz){
        for(Kniha k : kniha){
            if(k instanceof Detektivka){
                ((Detektivka) k).vypisInfo(uz,true);
            }
        }
    }
    static void akce(int a){
        switch(a){
            case 1:
                System.out.println("Vyberte ID knihy");
                vypsatKnihu(getKnihaFromID(getInt()),0);
                break;
            case 2:
                ArrayList<Kniha> koupeneKnihy = new ArrayList<>();
                System.out.println("Jaký jste uživatel:");
                System.out.println("1 - Nezaregistrovaný uživatel");
                System.out.println("2 - registrovaný uživatel");
                System.out.println("3 - zlatý registrovaný uživatel");
                int uzivatel = getUzivatel(getInt()-1);
                while(true){
                    System.out.println("Vyberte ID knihy");
                    Kniha k = getKnihaFromID(getInt());
                    koupeneKnihy.add(k);
                    vypsatKnihu(k,uzivatel);
                    System.out.println("Chcete pokračovat?");
                    System.out.println("1 - ano, 2 - ne");
                    if(getInt() == 2){
                        break;
                    }
                }
                vypsatKnihy(koupeneKnihy,uzivatel);
                System.out.println("Celková cena: " + celkemCena(koupeneKnihy,uzivatel));
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Akce neexistuje");
        }
    }
    public static void main(String[] args) {
        knihy.add(new Detektivka(new Autor("Karel","Čapek",1895),"Velké cesty",1920,500,"Karel Pankrác","Česká republika",1));
        knihy.add(new Detektivka(new Autor("Martin","Král",1450),"Detektivka",1495,200,"Bohumal Klapka","Itálie",2));
        knihy.add(new Detektivka(new Autor("Bonifác","Veliký",2000),"Panemia",2020,650,"Pranosta Pandalský","Anglie",3));
        knihy.add(new Detektivka(new Autor("Eva","Opatrná",1900),"Vražda",1950,150,"Pavel Chytrý","Antarktida",4));
        knihy.add(new Detektivka(new Autor("Martina","Nováková",1988),"Pomoc",2011,1000,"Pomocník","USA",5));
        while(true){
            System.out.println("Knihy:");
            vypsatKnihy();
            System.out.println("Co chcte podniknout:");
            System.out.println("1 - Prohlédnout knihu");
            System.out.println("2 - Koupit knihy");
            System.out.println("3 - Odejít");
            akce(getInt());
        }
    }
}
