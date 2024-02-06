package Taksimetre_hesaplama;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

 // Taksimetre Programı
//  Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

//  Taksimetre KM başına 2.20 TL tutmaktadır.
//  Minimum ödenecek tutar 20 TL'dir.
//  20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//  Taksimetre açılış ücreti 10 TL'dir.


        //Değişken tanımlama
        int taksimetreAcılısucret=10,mintutar=20;
        double kmFiyat=2.20,km,tutar,sonuc;
        boolean a;

        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("km'yi Giriniz:");
        km=input.nextInt();

        //hesaplam kısmı

        tutar=taksimetreAcılısucret+(kmFiyat*km);

        a=(tutar>=20);
        sonuc=(a) ?  tutar : 20;
        System.out.println("Üçret Tutarı:"+sonuc+" TL");



















    }





}
