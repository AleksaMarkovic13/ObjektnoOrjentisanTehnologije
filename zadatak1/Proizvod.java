package zadatak1;

public class Proizvod {
    private String ime;
    private int kolicina;
    private double cenaBezPdv;
    private double cenaUkupna;

    public double getCenaUkupna() {
        return cenaUkupna;
    }

    public void setCenaUkupna(double cenaUkupna) {
        this.cenaUkupna = cenaUkupna;
    }

    public double getCenaBezPdv() {
        return cenaBezPdv;
    }

    public void setCenaBezPdv(double cenaBezPdv) {
        this.cenaBezPdv = cenaBezPdv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    Proizvod(String ime, int kolicina, double cenaBezPdv){
        this.ime=ime;
        this.kolicina=kolicina;
        this.cenaBezPdv=cenaBezPdv;
        this.cenaUkupna=1.2*cenaBezPdv;
    }

    public void ispis(){
        System.out.println("Vrednost proizvoda: "+ime+" kolicine na stanju: "+kolicina+" jedinicne cene "+Math.round(cenaBezPdv)+
                " bez PDV-a je: "+Math.round(cenaBezPdv*kolicina)+", a uz PDV je: "+Math.round(cenaUkupna*kolicina));
    }

}
