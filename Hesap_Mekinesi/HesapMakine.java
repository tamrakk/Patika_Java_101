package Hesap_Mekinesi;
import java.util.Scanner;

public class HesapMakine {
    public static void main(String[] args) {

        //değişken tanımlama
        int n1,n2,select;

        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2=input.nextInt();


        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ?");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çırkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+ (n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bölme: "+ (n1/n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünmez");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz");
                break;

        }



    }
}
