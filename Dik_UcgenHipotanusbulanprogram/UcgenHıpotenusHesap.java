package Dik_UcgenHipotanusbulanprogram;
import java.util.Scanner;

public class UcgenHıpotenusHesap {
    public static void main(String[] args){
        //Değişkenler
        int kenar1,kenar2;
        double hipotenus;

        //kullanıcından veri alma

        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        kenar1=input.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        kenar2=input.nextInt();

        //formül
        hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs:" + hipotenus);



    }



}
