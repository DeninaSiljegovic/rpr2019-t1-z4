package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Supermarket supermarket;

    @BeforeEach
    void initializeSupermarket(){
        supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Hljeb", 1, "hlb"));
    }

    @Test
    void test1(){
        supermarket.dodajArtikl(new Artikl("Banane", 2, "bnn"));
        Korpa korpa = new Korpa();

        korpa.dodajArtikl(new Artikl("Banane", 2, "bnn"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(2, cijena);
    }

    @Test
    void test2(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Hljeb", 1, "hlb"));
        korpa.izbaciArtiklSaKodom("hlb");
        int cena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(0, cena);
    }

}