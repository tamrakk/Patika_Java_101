package Dairenin_AlanveCevreHesaplama;
import java.util.Scanner;

public class DaireAlanveCevreHesap {
    public static void main(String[] args) {

        //değişken tanımlama
        int r;
        double pi=3.14,alan,cevre;


        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girniniz;");
        r=input.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin alanı: "+ alan );
        System.out.println("Dairenin cevresi:" + cevre);





    }
}
