package Dedicnost_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Dinosaur> dinosaury = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static void vypis(){
        System.out.println("chcete vypsat jen obecné info o teropodech?(1-ano,0-ne)");
        int choice = sc.nextInt();
        for (Dinosaur dinosaur : dinosaury) {
            if(dinosaur instanceof Teropod){
                if(choice == 0){
                    ((Teropod) dinosaur).vratPopis(true);
                }else{
                    dinosaur.vratPopis();
                }
            }
            else{
                dinosaur.vratPopis();
            }
        }
    }
    public static void main(String[] args) {
        dinosaury.add(new Teropod("Bonifác","T-rex",15,150));
        dinosaury.add(new Teropod("Metoděj","T-rex",11,120));
        dinosaury.add(new Teropod("Pankrác","T-rex",8,15));
        dinosaury.add(new Sauropod("Anastázie","Pterodactyl",6,150));
        dinosaury.add(new Sauropod("Bartoloměj","Pterodactyl",2,20));
        dinosaury.add(new Sauropod("Gertrůda","Pterodactyl",45,300));
        vypis();
    }
}
