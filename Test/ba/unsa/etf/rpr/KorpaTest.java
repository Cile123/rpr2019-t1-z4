package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa temp = new Korpa();
        temp.dodajArtikl(new Artikl("Mlijeko", 2, "1"));
        temp.dodajArtikl(new Artikl("Hljeb", 1, "2"));
        temp.dodajArtikl(new Artikl("Nutella", 12, "3"));
        temp.dodajArtikl(new Artikl("Med", 15, "4"));

        assertEquals(30, temp.dajUkupnuCijenuArtikala());
    }

    @Test
    void dodajArtikl() {
        Korpa temp = new Korpa();
        for (int i = 0; i < 50; i++) {
            temp.dodajArtikl(new Artikl("Mlijeko", 2, "1"));
        }

        assertEquals(50, temp.getBrojArtikala());
        assertFalse(temp.dodajArtikl(new Artikl("Hljeb", 1, "51")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa temp = new Korpa();
        assertNull(temp.izbaciArtiklSaKodom("2"));

        temp.dodajArtikl(new Artikl("Mlijeko", 2, "1"));
        temp.dodajArtikl(new Artikl("Hljeb", 1, "2"));
        temp.dodajArtikl(new Artikl("Nutella", 12, "3"));
        temp.dodajArtikl(new Artikl("Med", 15, "4"));
        temp.izbaciArtiklSaKodom("3");
        assertEquals(3, temp.getBrojArtikala());

        assertNull(temp.izbaciArtiklSaKodom("5"));
    }
}