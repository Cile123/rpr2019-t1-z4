package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] Artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public int getBrojArtikala() {
        return brojArtikala;
    }

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
        if (this.getBrojArtikala() == 0)
            return null;

        for (int i = 0; i < brojArtikala; i++) {
            if (Artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(Artikli[i].getNaziv(), Artikli[i].getCijena(), Artikli[i].getKod());
                Artikli[i] = null;
                for (int j = i; j < brojArtikala-1; j++)
                    Artikli[j] = Artikli[j+1];
                brojArtikala = brojArtikala - 1;
                return temp;
            }
        }
        return null;
    }
}
