package zadatak1;
import java.util.Scanner;
public class ProizvodTest {
    public static void main(String[] args){
        int unos,kolicina;
        int brojac=0;
        String ime;
        double cena;
        Scanner sc=new Scanner(System.in);
        Proizvod[] arhiva=new Proizvod[100];
        do{
            System.out.println("Ukoliko zelite da prestanete sa unosom proizvoda pritisnite 0,svaki drugi broj=nastavak unosa");
            unos=sc.nextInt();
            sc.nextLine();
            if(unos!=0) {
                System.out.println("unesite ime proizvoda");
                ime = sc.nextLine();
                System.out.println("unesite cenu proizvoda");
                cena = sc.nextDouble();
                System.out.println("unesite kolicinu");
                kolicina = sc.nextInt();
                arhiva[brojac] = new Proizvod(ime, kolicina, cena);
                brojac++;
            }
        }while(unos!=0&&brojac<100);
        System.out.println("Da li zelite da ispisete neki od proizvoda? 1=DA");
        unos=sc.nextInt();
        if(unos==1){
            System.out.println("Koji redni broj proizvoda zelite da ispisete?");
            unos=sc.nextInt();
            while(unos>brojac||unos<1) {
                System.out.println("pogresan unos, probajte opet:");
                unos=sc.nextInt();
            }
            arhiva[unos-1].ispis();
        }
        else {
            sc.close();
            System.exit(1);
        }
    }
}
