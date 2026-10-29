package zadatak4;
import java.util.Scanner;

public class SumaParnih {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int unos=1;
        int suma=0;
        do {
            if(unos<1)System.out.println("Pogresan unos");
            System.out.println("Unesite celobrojnu vrednost vecu od nule");
            unos = sc.nextInt();
        }while (unos<1);
        int i=1;
        while(i<unos+1){
            if(i%2==0)suma+=i;
            i++;
        }
        int suma2=0;
        for(int j=0;j<unos;j++){
            if((j+1)%2==0)suma2+=j+1;
        }
        if(suma!=suma2)System.out.println("greska!!!");
        else System.out.println("Zbir parnih brojeva od 1 do "+unos+" je "+suma);
        sc.close();
    }
}
