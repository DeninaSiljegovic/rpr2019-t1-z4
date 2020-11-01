package ba.unsa.etf.rpr;

public class Artikl {

    private String kod;
    private int cijena;
    private String naziv;

    Artikl(String ime, int cijena, String kod){
        naziv=ime; this.cijena=cijena; this.kod=kod;
    }

   String getKod(){
       return kod;
   }

   int getCijena(){
       return cijena;
   }

   String getNaziv(){
       return naziv;
   }
}
