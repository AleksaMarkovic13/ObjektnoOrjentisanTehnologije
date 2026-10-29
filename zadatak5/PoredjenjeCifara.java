package zadatak5;
import java.util.Scanner;

public class PoredjenjeCifara {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("unesite trocifreni broj");
        int unos= sc.nextShort();
        while(unos>999||unos<100){
            System.out.println("pogresan unos probajte opet");
            unos= sc.nextInt();
        }
        int cifStotina=unos/100;
        int cifDesetica=(unos-100*cifStotina)/10;
        int cifJedinica=unos-100*cifStotina-10*cifDesetica;
        System.out.printf("Za broj %d cifra stotina je %d, cifra desetica je %d, cifra jedinica je %d\n",unos,cifStotina,cifDesetica,cifJedinica);
        int najveci=cifJedinica;
        if(cifDesetica>=cifJedinica&&cifDesetica>=cifStotina)najveci=cifDesetica;
        if(cifStotina>=cifJedinica&&cifStotina>=cifDesetica)najveci=cifStotina;
        System.out.println("Najveca cifra u broju je: "+najveci);

        sc.close();
    }
}
