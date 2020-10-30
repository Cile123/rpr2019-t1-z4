package ba.unsa.etf.rpr;

public class Artikl {
    private String Naziv, Kod;
    private int Cijena;

    public String getNaziv() {
        return Naziv;
    }
    public int getCijena() {
        return Cijena;
    }
    public String getKod() {
        return Kod;
    }

    public Artikl(String Naziv, int Cijena, String Kod) {
        this.Naziv = Naziv;
        this.Cijena = Cijena;
        this.Kod = Kod;
    }
}