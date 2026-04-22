package Interface.int2;

public class StitovyGenerator implements IAktivovatelny{
    private int energie;
    private int integrita;
    public StitovyGenerator(int energie, int integrita) {
        this.energie = energie;
        this.integrita = integrita;
    }
    public boolean aktivuj(){
        if(energie >= 40 && integrita >= 50){
            energie -= 40;
            integrita -= 10;
            return true;
        }
        return false;
    }
    public void vypisStav(){
        System.out.println("Stav Generátoru Energie: " + energie + " Integrita: " + integrita);
    }
}
