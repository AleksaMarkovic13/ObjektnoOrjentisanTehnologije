package zadatak2;
import java.util.Scanner;
public class BrojGodina {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int unos=0;
       do{
           if(unos<0||unos>200){
               System.out.println("POGRESAN UNOS!!!");
           }
           System.out.println("Unesite vas broj godina");
           unos= sc.nextInt();
       }while (unos<0||unos>200);

       if(unos<=12)System.out.println("Dete");
       else if (unos<=19)System.out.println("Tindejdzer");
       else if (unos<65)System.out.println("Odrasla osoba");
       else System.out.println("Starija osoba");
       sc.close();
    }
}
