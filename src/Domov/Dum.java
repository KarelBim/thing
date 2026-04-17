package Domov;

import java.util.Scanner;

public class Dum {
    static Mistnost[] mistnost = new Mistnost[3];
    static Scanner sc = new Scanner(System.in);
    static void vypsatMistnosti(int k){
        for(Mistnost mistnost : mistnost){
            System.out.print(k +  " - ");
            System.out.println(mistnost.getNazev());
            k++;
        }
    }
    static void vypsatMistnosti(){
        for(Mistnost mistnost : mistnost){
            System.out.println(mistnost.getNazev());
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
        sc.nextLine();
        return num;
    }
    static double getDouble(){
        double num;
        try{
            num = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Musí být celé číslo");
            sc.nextLine();
            return getNum();
        }
        sc.nextLine();
        return num;
    }
    static int getNum(int n){
        int num;
        if(n == 0){
            n = Integer.MAX_VALUE;
        }
        try{
            num = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Musí být celé číslo");
            sc.nextLine();
            return getNum();
        }
        if(num > n || num < 0){
            System.out.println("číslo musí být kládné a v intervalu");
            return getNum();
        }
        else {
            sc.nextLine();
            return num;
        }
    }
    static void akce(int akce){
        Mistnost mist = null;
        switch (akce){
            case 1:
                vypsatMistnosti();
                break;
            case 2:
                System.out.println("Do jaké místnosti chcete přidat nábytek:");
                vypsatMistnosti(1);
                mist = mistnost[getNum(mistnost.length)-1];
                do {
                    System.out.println("Jméno nábytku který chcete přidat: ");
                    String nameNabytek = sc.nextLine();
                    System.out.println("Cena nábytku který chcete přidat: ");
                    double cenaNabytek = getDouble();
                    while(cenaNabytek < 0){
                        System.out.println("Cena nemůže být záporná");
                        cenaNabytek = getDouble();
                    }
                    mist.addNabytek(new Nabytek(nameNabytek, cenaNabytek));
                    System.out.println("Chcete přidat více nábytku do " + mist.getNazev() + " 1 - ano 2 - ne");
                }while(getNum(2) == 1);
                mist.popis();
                break;
            case 3:
                System.out.println("Z jaké místnosti chcete odebrat nábytek:");
                vypsatMistnosti(1);
                mist = mistnost[getNum(mistnost.length)-1];
                if(mist.getPocetNabytku() == 0){
                    System.out.println("V místnostni není nábytek");
                }
                else{
                    int pomoc = 0;
                    do {
                        System.out.println("co chcete odebrat:");
                        mist.popis();
                        mist.removeNabytek(getNum(mist.getPocetNabytku()) - 1);
                        if (mist.getPocetNabytku() != 0) {
                            System.out.println("chcete odebrat více nábytku do " + mist.getNazev() + " 1 - ano 2 - ne");
                            pomoc = getNum(2);
                        }
                        else{
                            pomoc = 0;
                        }
                    }while(pomoc == 1);
                }
                break;
            case 4:
                System.out.println("jakou místnost chcete přejmenovat:");
                vypsatMistnosti(1);
                mist = mistnost[getNum(mistnost.length)-1];
                mist.setNazev(sc.nextLine());
                break;
            case 5:
                System.exit(0);
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
            System.out.println("3 - odebrat nábytek");
            System.out.println("4 - přejmenovat místnost");
            System.out.println("5 - ukončit program");
            akce(getNum());
        }
    }
}
