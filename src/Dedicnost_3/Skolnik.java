package Dedicnost_3;

public class Skolnik extends Osoba{
    private boolean driversLicense = false;
    public Skolnik(String name,int age,boolean driversLicense){
        super(name,age);
        this.driversLicense = driversLicense;
    }
    public boolean hasDriversLicense(){
        return driversLicense;
    }
}
