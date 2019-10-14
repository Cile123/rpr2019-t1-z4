package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] Artikli = new Artikl[1000];
    private static int brojArtikala = 0;

    public void dodajArtikl(Artikl temp) {
        if (brojArtikala > 999) {
            System.out.println("Dostignut maximalan broj artikala");
            return;
        }
        Artikli[brojArtikala] = temp;
        brojArtikala = brojArtikala + 1;
    }

    public Artikl[] getArtikli() {
        return Artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
    }
}
