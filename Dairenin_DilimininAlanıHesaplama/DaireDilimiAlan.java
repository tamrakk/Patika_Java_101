package Dairenin_DilimininAlanıHesaplama;
import java.util.Scanner;

public class DaireDilimiAlan {

    public static void main(String[] args) {

        //değişkenleri tanımlama

        //r=yarı çap,a=merkez açısı ölçüsü
        int r,a;
        double pi=3.14,dilimAlan;

        //kullanıcıdan veri alma

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz:");
        r=input.nextInt();
        System.out.print("Dairenin merkez açısını giriniz:");
        a=input.nextInt();


        //formul kısmı

        dilimAlan=(pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alanı:" + dilimAlan);


    }

}
