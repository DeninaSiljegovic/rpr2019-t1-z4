package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl niz[] = new Artikl[50];
    private int aktivno=0;

    public Artikl izbaciArtiklSaKodom(String kod) {

       for(int i=0; i < niz.length; i++){
           Artikl c = niz[i];
           if(c.getKod().equals(kod)){
               niz[i]=niz[aktivno-1];
               aktivno = aktivno - 1;
               return c;
           }
        }
       return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i < aktivno; i++){
            suma = suma + niz[i].getCijena();
        }
        return suma;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public boolean dodajArtikl(Artikl a) {
        if(niz.length==50) return false;
        niz[aktivno]=a;
        aktivno = aktivno + 1;
        return true;
    }

}
