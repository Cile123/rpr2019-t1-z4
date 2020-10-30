package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] Artikli = new Artikl[1000];
    private static int brojArtikala = 0;

    public boolean dodajArtikl(Artikl temp) {
        if (brojArtikala > 999) {
            return false;
        }
        Artikli[brojArtikala] = temp;
        brojArtikala = brojArtikala + 1;
        return true;
    }
    public Artikl[] getArtikli() {
        return Artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        if (Artikli == null)
            return null;

        for (int i = 0; i < brojArtikala; i++) {
            if (Artikli[i].getKod().equals(kod)) {
                for (int j = i; j < brojArtikala-1; j++)
                    Artikli[j] = Artikli[j+1];
                brojArtikala = brojArtikala - 1;
                return Artikli[brojArtikala-1];
            }
        }
        return null;
    }
}
