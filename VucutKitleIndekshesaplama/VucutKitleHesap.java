package VucutKitleIndekshesaplama;
import java.util.Scanner;

public class VucutKitleHesap {
    public static void main(String[] args) {

        //değişken tanımlama

        int kilo;
        double boy,kitleEndeks;

        //kullanıcıdan veri alma

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo=input.nextInt();

        // formul kısmı
        kitleEndeks=kilo/(boy*boy);
        System.out.print("Vucüt Kitle İndeksiniz: " + kitleEndeks);





    }
}
