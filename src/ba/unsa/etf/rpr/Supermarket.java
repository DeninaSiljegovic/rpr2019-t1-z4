package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl market[] = new Artikl [1000];
    private int dostupno=0;

    public void dodajArtikl(Artikl a) {
        if(dostupno == 1000) return;
        market[dostupno]=a;
        dostupno = dostupno + 1;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i=0; i < dostupno; i++){

            Artikl c=market[i];

            if(c.getKod().equals(kod)){
                market[i] = market[dostupno-1];
                dostupno = dostupno - 1;
                return c;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return market;
    }
}
