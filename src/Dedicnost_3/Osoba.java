package Dedicnost_3;

public class Osoba {
    private String name;
    private int age;
    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void vypisInfo(){
        System.out.println("Jméno: " + name + " věk: " + age);
    }
    public void predstavSe(){
        System.out.print("Dobrý den jsem " + name);
    }
    public double getPrumer(){
        return Integer.MAX_VALUE;
    }
}
