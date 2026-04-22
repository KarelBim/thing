package Interface.int2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Skenner skenner = new Skenner(10,60);
        StitovyGenerator generator = new StitovyGenerator(100,50);
        LaserovyModul modul = new LaserovyModul(100,50);
        IAktivovatelny[] l = {skenner, generator, modul};
        Random rand = new Random();
        for(int i = rand.nextInt(5);i>0;i--){
            for(IAktivovatelny aktivovatelny : l){
                if(aktivovatelny.aktivuj()){
                    System.out.println("Modul aktivován");
                }
                aktivovatelny.vypisStav();
            }
        }
    }
}
