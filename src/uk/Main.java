package uk;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int getCislo(){
        try{
            int cislo = sc.nextInt();
            sc.nextLine();
            return cislo;
        }
        catch(Exception e){
            sc.nextLine();
            return -1;
        }
    }
    public static String getJmeno(){
        System.out.print("Jmeno: ");
        return sc.next();
    }
    public static int getRokNarozeni(){
        System.out.print("Rok narozeni: ");
        int  rokNarozeni = getCislo();
        if(rokNarozeni< 0){
            System.out.println("Rok narození musí být kladné číslo");
            return -1;
        }
        return rokNarozeni;
    }
    public static void pridatZvire(ManagerZoo m){
        System.out.println("Jaké zvíře chcete přidat: ");
        System.out.println("1 - Pes");
        System.out.println("2 - Zelva");
        System.out.println("3 - Had");
        System.out.println("4 - zpět");
        String jmeno;
        int rokNarozeni;
        switch (getCislo()) {
            case 1:
                jmeno = getJmeno();
                rokNarozeni = getRokNarozeni();
                if(rokNarozeni<0){
                    pridatZvire(m);
                    return;
                }
                m.pridatZvire(new Pes(jmeno, rokNarozeni));
                break;
            case 2:
                System.out.println("Jakou želvu?");
                System.out.println("1 - normální");
                System.out.println("2 - vodní");
                System.out.println("3 - Suchozemska");
                switch (getCislo()) {
                    case 1:
                        jmeno = getJmeno();
                        rokNarozeni = getRokNarozeni();
                        if(rokNarozeni<0){
                            pridatZvire(m);
                            return;
                        }
                        m.pridatZvire(new Zelva(jmeno, rokNarozeni));
                        break;
                    case 2:
                        jmeno = getJmeno();
                        rokNarozeni = getRokNarozeni();
                        if(rokNarozeni<0){
                            pridatZvire(m);
                            return;
                        }
                        m.pridatZvire(new VodniZelva(jmeno, rokNarozeni));
                        break;
                    case 3:
                        jmeno = getJmeno();
                        rokNarozeni = getRokNarozeni();
                        if(rokNarozeni<0){
                            pridatZvire(m);
                            return;
                        }
                        m.pridatZvire(new SuchozemskaZelva(jmeno, rokNarozeni));
                        break;
                    default:
                        System.out.println("ŠPATNÝ VSTUP");
                        pridatZvire(m);
                }
                break;
            case 3:
                jmeno = getJmeno();
                rokNarozeni = getRokNarozeni();
                if(rokNarozeni<0){
                    pridatZvire(m);
                    return;
                }
                m.pridatZvire(new Had(jmeno, rokNarozeni));
                break;
            case 4:
                return;
            default:
                System.out.println("Špatný vstup");
                pridatZvire(m);
        }
    }
    public static void main(String[] args) {
        ManagerZoo managerZoo = new ManagerZoo();
        //Main m = new Main();
        while(true){
            System.out.println("CO chcete udělat: ");
            System.out.println("1 - přidat zvíře");
            System.out.println("2 - odebrat zvíře");
            System.out.println("3 - ukázat zvířata");
            System.out.println("4 - nejmladsi zvire");
            System.out.println("5 - nejstarsi zvire");
            System.out.println("6 - konec");
            switch (getCislo()){
                case 1:
                    pridatZvire(managerZoo);
                    break;
                case 2:
                    managerZoo.vypsatZvirata();
                    managerZoo.removeZvire(sc.next());
                    break;
                case 3:
                    managerZoo.vypsatZvirata();
                    break;
                case 4:
                    if(managerZoo.getZvirata().isEmpty()){
                        System.out.println("Zvíře neexistuje");
                    }
                    else{
                        managerZoo.getNejmladsiZvire().vypisJmenoADatum();
                    }
                    break;
                case 5:
                    if(managerZoo.getZvirata().isEmpty()){
                        System.out.println("Zvíře neexistuje");
                    }
                    else{
                        managerZoo.getNejstarsiZvire().vypisJmenoADatum();
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("špatný vstup");
            }
        }
    }
}
