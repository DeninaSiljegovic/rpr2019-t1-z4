package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void test1(){
        Supermarket market = new Supermarket();
        market.dodajArtikl(new Artikl("kuca", 5, "home"));
        market.dodajArtikl(new Artikl("laptop", 10, "pc"));
        Artikl vraceno[] = market.getArtikli();

       int t=0;
       for(int i=0; i<vraceno.length; i++){
           if(vraceno[i]!=null) t = t + 1;
           else break;
       }
       assertEquals(2, t);
    }

    @Test
    void test2(){
        Supermarket market = new Supermarket();
        market.dodajArtikl(new Artikl("kuca", 5, "home"));
        market.dodajArtikl(new Artikl("laptop", 10, "pc"));
        market.dodajArtikl(new Artikl("medo brundo", 20, "medo"));

        market.izbaciArtiklSaKodom("home");
        market.izbaciArtiklSaKodom("pc");

        Artikl vraceno[] = market.getArtikli();

        int t=0;
        for(int i=0; i<vraceno.length; i++){
            if(vraceno[i]!=null) t = t + 1;
            else break;
        }
        assertEquals(1, t);
    }

}