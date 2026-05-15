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
        int[] cislice = new int[10];
        int pocetByk = 0;
        int pocetKrav = 0;
        String hadanaCislice = hadaneCislo+"";
        String hracovoCislice = hracovoCislo+"";
        int[] cislaKtereNe = new int[hracovoCislice.length()];
        for(char a : hadanaCislice.toCharArray()){
            cislice[Character.getNumericValue(a)]++;
        }
        int i =0;
        while(i != hadanaCislice.length()){
            for(int j=0;j<hracovoCislice.length();j++){
                int cisliceCisla = Character.getNumericValue(hadanaCislice.charAt(i));
                int cisliceHrace = Character.getNumericValue(hracovoCislice.charAt(j));
                if(cisliceCisla == cisliceHrace) {
                    if (cislaKtereNe[j] == 0) {
                        if (i == j) {
                            pocetByk++;
                            cislaKtereNe[j] = 1;
                        } else if (cislice[cisliceHrace] != 0) {
                            pocetKrav++;
                        }
                        cislice[cisliceHrace]--;
                        i++;
                    }
                }
            }
            i++;
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
