package hadani;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public int getInt(int velikost){
        int num = 0;
        try{
            String numStr = sc.nextLine();
            if(Character.getNumericValue(numStr.charAt(0)) == 0 || velikost != numStr.length()){
                System.out.println("číslo nemůže začínat na 0 a musí být dostatečně dlouhé");
                num = getInt(velikost);
            }
            else{
                num = Integer.parseInt(numStr);
            }
        }
        catch(Exception e){
            System.out.println("Musí být celé číslo");
            num = getInt(velikost);
        }
        return num;
    }
    public int[] getPocetBykAKrava(int hadaneCislo,int hracovoCislo){
        int[] cisliceHadane = new int[10];
        int[] cisliceHracova = new int[10];
        int pocetByk = 0;
        int pocetKrav = 0;
        String hadanaCislice = hadaneCislo+"";
        String hracovoCislice = hracovoCislo+"";
        String hadanaCisliceKrav = "";
        String hracovaCisliceKrav = "";
        for(int i = 0;i<hadanaCislice.length();i++){
            if(hadanaCislice.charAt(i) == hracovoCislice.charAt(i)){
                pocetByk++;
            }
            else{
                hadanaCisliceKrav += hadanaCislice.charAt(i);
                hracovaCisliceKrav += hracovaCislice.charAt(i);
            }
        }
        for(char a : hadanaCisliceKrav.toCharArray()){
            cisliceHadane[Character.getNumericValue(a)]++;
        }
        for(char a : hracovaCisliceKrav.toCharArray()){
            cisliceHracova[Character.getNumericValue(a)]++;
        }
        for(int i = 0;i<hadaneCisliceKrav.length;i++){
            if(cisliceHadane[i] != 0 && cisliceHracova[i] != 0){
                int num = cisliceHracova[i] - cisliceHadane[i];
                pocetKrav += (num < 0) cisliceHracova[i]:cisliceHadane[i];
            }
        }
        return new int[]{pocetByk,pocetKrav};
    }
    public static void main(String[] args) {
        Main m = new Main();
        Random rand = new Random();
        int randomNum = rand.nextInt(100000)+100;
        System.out.println(randomNum);
        System.out.println("Číslo je " +(""+ randomNum).length() + ". ciferné");
        int hracovoCislo = 0;
        do{
            System.out.println("Hádej číslo");
            hracovoCislo = m.getInt((""+randomNum).length());
            int[] bykAKrava = m.getPocetBykAKrava(randomNum,hracovoCislo);
            System.out.println(bykAKrava[0] + " " + bykAKrava[1]);
        }while(hracovoCislo != randomNum);

    }
}
