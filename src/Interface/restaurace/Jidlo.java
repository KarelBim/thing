package Interface.restaurace;

import java.util.ArrayList;

public class Jidlo implements IAlergenni{
    private String jmeno;
    private double cena;
    public Jidlo(String jmeno, double cena) {
        this.jmeno = jmeno;
        this.cena = cena;
    }
    public String vratAlergeny(){
        return "Žádné alergeny";
    }
    public void vypisJidlo(){
        System.out.println("Jméno: " + jmeno + " cena: " + cena);
    }
}
