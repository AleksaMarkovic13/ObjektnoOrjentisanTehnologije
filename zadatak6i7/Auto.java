package zadatak6i7;
import java.util.Scanner;

public class Auto {
    private int brzina;
    private String marka;
    private boolean ukljucen;

    Auto(int brzina,String marka,boolean ukljucen){

        setBrzina(brzina);
        this.marka=marka;
        this.ukljucen=ukljucen;

    }

    Auto() {
    }

    Auto(String marka, int brzina){
        this.marka=marka;
        setBrzina(brzina);
        this.ukljucen=true;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        Scanner sc=new Scanner(System.in);
        while(brzina<0){
            System.out.println("pogresan unos brzine,ne moze biti negativna,probajte ponovo");
            brzina=sc.nextInt();
        }
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void setUkljucen(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }

    public void ubrzaj(int koliko){
        if(ukljucen) {
            brzina += Math.pow(koliko*koliko,0.5);
        }
        else{
            System.out.println("auto je iskljucen pa ne moze da ubrza\n");
        }
    }

    public void stani(){
        if(brzina==0||ukljucen==false){
            System.out.println("Nije moguce izvrsavanje zaustavljanja, auto vec stoji\n");
        }
        else{
            System.out.printf("Auto se zaustavio za %d sekundi\n\n",Math.min(4+(4*(brzina/50)),12));
        brzina=0;
        }
    }

    public void oAutu(){
        if(marka==null)System.out.println("auto jos nije inicijalizovan\n");

        else {

            System.out.println("Marka: " + marka);
            if (ukljucen) {
                System.out.println("Auto je ukljucen");
                System.out.println("Trenutna brzina: " + brzina+"\n");
            } else System.out.println("Auto je iskljucen\n");
        }
    }
}
