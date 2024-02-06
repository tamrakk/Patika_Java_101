package Ucgen_AlanHesaplama;
import java.util.Scanner;

public class UcegenAlan {
    public static void main(String[] args){

        //Değişken tanımlama
        int kenar1,kenar2,kenar3,cevre;
        double alan,u;

        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı Grininiz:");
        kenar1=input.nextInt();
        System.out.print("2.Kenarı Grininiz:");
        kenar2=input.nextInt();
        System.out.print("3.Kenarı Grininiz:");
        kenar3=input.nextInt();

        //formül

        cevre=kenar1+kenar2+kenar3;
        u=cevre/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin Alanı: " + alan);



    }
}
