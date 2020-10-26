package ba.unsa.etf.rpr;

public class Artikl {

    private String kod;
    private double cijena;
    private String naziv;

    Artikl(String ime, double cijena, String kod){
        kod=ime; this.cijena=cijena; this.kod=kod;
    }

   String getKod(){
       return kod;
   }

   double getCijena(){
       return cijena;
   }

   String getNaziv(){
       return naziv;
   }
}
