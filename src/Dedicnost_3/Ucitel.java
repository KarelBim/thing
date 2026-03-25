package Dedicnost_3;

public class Ucitel extends Osoba{
    private String subject;
    private String cabinet;
    public Ucitel(String name,int age,String subject,String cabinet) {
        super(name,age);
        this.subject = subject;
        this.cabinet = cabinet;
    }
    public String getSubject() {
        return subject;
    }
    public String getCabinet() {
        return cabinet;
    }
    public void predstavSe(){
        super.predstavSe();
        System.out.println(" jsem učitel.");
    }
}
