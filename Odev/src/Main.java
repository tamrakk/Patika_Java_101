
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int sayi,toplam = 0,sayac=0,sonuc=0;

        System.out.print("Bir Sayı Giriniz:");
        sayi=input.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%3 ==0 && i%4 ==0){
                toplam=toplam+i;
                sayac++;
            }


        }
        System.out.println(sayac);
        System.out.println(toplam);
        sonuc=toplam/sayac;
        System.out.print(sonuc);


    }
}