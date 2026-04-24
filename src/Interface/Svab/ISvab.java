package Interface.Svab;

public interface ISvab {
    String getJmeno();
    boolean muzeProjit(Prekazka p);
    void projdiPrekazku(Prekazka p);
    boolean jeNazivu();
    int getEnergie();
    int getPocetProjitychPrekazek();
    void vypisStav();
}
