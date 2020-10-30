package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] Artikli = new Artikl[50];
    private int brojArtikala = 0;

    public Artikl[] getArtikli() {
        return Artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for (int i = 0; i < brojArtikala; i++) {
            cijena = cijena + Artikli[i].getCijena();
        }
        return cijena;
    }

    public boolean dodajArtikl(Artikl a) {
        if (brojArtikala > 49)
            return false;

        Artikli[brojArtikala] = a;
        brojArtikala = brojArtikala + 1;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
//        if (Artikli == null)
//            return null;

        for (int i = 0; i < brojArtikala; i++) {
            if (Artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(Artikli[i].getNaziv(), Artikli[i].getCijena(), Artikli[i].getKod());
                Artikli[i] = null;
                for (int j = i; j < brojArtikala-1; j++) {
                    Artikli[j] = Artikli[j + 1];
                }
                brojArtikala = brojArtikala - 1;
                return temp;
            }
        }
        return null;
    }
}