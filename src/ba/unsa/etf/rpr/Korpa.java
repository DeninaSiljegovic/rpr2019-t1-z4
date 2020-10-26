package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl niz[] = new Artikl[50];
    private int aktivno=0;

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<aktivno; i++){
            if(niz[i].getKod().equals(kod)){
                niz[i]=niz[aktivno-1];
                aktivno-=1; i-=1;
            }
        }
    }


    public int dajUkupnuCijenuArtikala() {

    }

    public Artikl[] getArtikli() {

    }

    public boolean dodajArtikl(Artikl a) {

    }
}
