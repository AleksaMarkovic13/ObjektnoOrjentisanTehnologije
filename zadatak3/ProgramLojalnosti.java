package zadatak3;
import java.util.Scanner;
public class ProgramLojalnosti {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Unesite cenu proizvoda");
        double cena=sc.nextDouble();
        System.out.println("Unesite broj zvezdica lojalnosti(1-5)");
        short brZvezdica= sc.nextShort();
        if(brZvezdica>5||brZvezdica<1)System.out.println("Pogresan unos");
        else{
            System.out.println("Cena proizvoda je: "+cena+", broj zvezdica lojalnosti je: "+brZvezdica
            +" pa je konacna cena: "+cena*(1-0.05*(brZvezdica-1)));
        }
    sc.close();
    }
}
