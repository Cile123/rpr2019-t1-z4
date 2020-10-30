package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket temp = new Supermarket();
        for (int i = 0; i < 1000; i++) {
            temp.dodajArtikl(new Artikl("Mlijeko", 2, "1"));
        }

        assertEquals(1000, temp.getBrojArtikala());
        assertFalse(temp.dodajArtikl(new Artikl("Nutella", 12, "1001")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket temp = new Supermarket();
        assertNull(temp.izbaciArtiklSaKodom("1"));

        temp.dodajArtikl(new Artikl("Med", 15, "1"));
        temp.dodajArtikl(new Artikl("Coca-Cola", 2, "2"));
        temp.dodajArtikl(new Artikl("Hljeb", 1, "3"));

        temp.izbaciArtiklSaKodom("2");
//        assertEquals("Coca-Cola", temp.);
        assertEquals(2, temp.getBrojArtikala());

        assertNull(temp.izbaciArtiklSaKodom("5"));
    }
}