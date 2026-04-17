package statics;
import java.util.ArrayList;
import java.util.Scanner;

public class RodinyUcet {
    static Scanner sc = new Scanner(System.in);
    public Osoba pouzivanyUcet = null;
    static int provedeneTransakce = 0;
    public double zustatek = 15000;
    public int getNum(){
        int pomoc = 0;
        try{
            pomoc = sc.nextInt();
        }
        catch(Exception e){
            sc.nextLine();
            System.out.println("Musí být celé číslo");
            getNum();
        }
        sc.nextLine();
        return pomoc;
    }
    public Osoba getOsobaZCislo(ArrayList<Osoba> osoba,int cisloUctu){
        for(Osoba o : osoba){
            if(o.getCisloUctu() == cisloUctu){
                return o;
            }
        }
        return null;
    }
    public void vyberUctu(ArrayList<Osoba> osoby){
        System.out.println("Vyberte číslo účtu");
        for(Osoba osoba : osoby){
            System.out.println("Osoba: " + osoba.getCeleJmeno() + " Číslo účtu: " + osoba.getCisloUctu());
        }
        Osoba pomoc = getOsobaZCislo(osoby,getNum());
        if(pomoc == null){
            System.out.println("Špatné číslo účtu");
            vyberUctu(osoby);
        }
        else {
            pouzivanyUcet = pomoc;
        }
    }
    public double getDouble(){
        double pomoc = 0;
        try{
            pomoc = sc.nextDouble();
        }
        catch(Exception e){
            sc.nextLine();
            System.out.println("Musí být celé číslo");
            getNum();
        }
        sc.nextLine();
        return pomoc;
    }
    public void akce(ArrayList<Osoba> osoby){
        switch (getNum()){
            case 1:
                System.out.print("Cena transakce: ");
                double cenaTransakce = getDouble();
                if(cenaTransakce > zustatek){
                    System.out.println("Nedostatek peněz na účtu");
                    return;
                }
                if(pouzivanyUcet instanceof Zena){
                    if(cenaTransakce > ((Zena) pouzivanyUcet).getMaxCastka()){
                        System.out.println("Přesažena maximální povolená částka transakce");
                        System.out.println("Limit: " + ((Zena) pouzivanyUcet).getMaxCastka());
                        return;
                    }
                }
                else {
                    System.out.print("Typ transakce: ");
                    String typTransakce = sc.nextLine();
                    if(((Muz) pouzivanyUcet).nechteneZbozi(typTransakce)){
                        System.out.println("Nechťený typ zboží");
                        return;
                    }
                }
                provedeneTransakce++;
                zustatek -= cenaTransakce;
                break;
            case 2:
                vyberUctu(osoby);
                break;
            case 3:
                System.out.println("Zůstatek: " + zustatek);
                break;
            case 4:
                System.out.println("Počet provedených transakcí: " + provedeneTransakce);
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        RodinyUcet r = new RodinyUcet();
        ArrayList<Osoba> osoby = new ArrayList<>();
        ArrayList<Zbozi> nepovoleneZbozi = new ArrayList<>();
        nepovoleneZbozi.add(new Zbozi(150,"Kosmetika","Zubní pasta"));
        osoby.add(new Muz (20,"Pepa","Novák",158695,nepovoleneZbozi));
        osoby.add(new Zena(23,"Hermiona","Nováková",184582,2500));
        r.vyberUctu(osoby);
        while(true){
            System.out.println("co chcete podniknout");
            System.out.println("1 - Provést transakci");
            System.out.println("2 - Změnit účet");
            System.out.println("3 - zústatek účtu");
            System.out.println("4 - ukončit program");
            r.akce(osoby);
        }
    }
}
