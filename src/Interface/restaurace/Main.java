package Interface.restaurace;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public void vypsatJ(ArrayList<IObjednani> objednavky){
        for(int i = 0; i < objednavky.size(); i++){
            System.out.println(i);
        }
    }
    public void vypsat(ArrayList<Jidlo> jidla){
        for(int i = 0; i<jidla.size(); i++){
            System.out.print(i +  1 + " - ");
            jidla.get(i).vypisJidlo();
            System.out.println("Alergenny: " + jidla.get(i).vratAlergeny());
            System.out.println();
        }
    }
    public int getCislo(){
        int cislo = 0;
        try{
            cislo = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e){
            System.out.println("Špatný vstup!");
            cislo = getCislo();
        }
        return cislo;
    }
    public static void main(String[] args) {
        ArrayList<Jidlo> menu = new ArrayList<>();
        Main m = new Main();
        ArrayList<IObjednani> objednavky = new ArrayList<>();
        menu.add(new Jidlo("řízek",100));
        menu.add(new Jidlo("Pepsi",50));
        menu.add(new Jidlo("Koláč",150));
        menu.add(new Jidlo("pomazánka",10));
        while(true){
            System.out.println("Co chcete podniknout: ");
            System.out.println("1 - nová objednávka");
            System.out.println("2 - zobraz objednávky");
            System.out.println("3 - ukončit");
            switch(sc.nextLine()){
                case "1":
                    do {
                        System.out.println("Co chcete: ");
                        m.vypsat(menu);
                        objednavky.add(new JidloKRozvozu());
                        Jidlo j = menu.get(m.getCislo() - 1);
                        System.out.println("Kolik chcete: ");
                        int cislo = m.getCislo();
                        IObjednani objednavka = objednavky.get(cislo - 1);
                        objednavka.addJidla(j, cislo);
                        objednavka.objednej(cislo);
                        System.out.println("chcete pokračovat? y:n");
                        if(sc.nextLine().equalsIgnoreCase("y")){
                            break;
                        }
                    } while(true);
                    break;
                case "2":
                    System.out.println("Vyberte objednávku na vypsání");
                    m.vypsatJ(objednavky);
                    m.vypsat(objednavky.get(m.getCislo()).getJidla());
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("špatný vstup");
            }
        }
    }
}
