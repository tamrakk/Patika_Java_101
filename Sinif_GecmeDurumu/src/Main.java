import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int mat,fizik,turkce,kimya,muzik,sayac=0,toplam=0;
        double avarage;

        //kullanıcından değer alma
        Scanner input = new Scanner(System.in);

        System.out.print("matemetik notunuz:");
        mat=input.nextInt();
        if(mat>=0 && mat<=100){
            toplam=toplam+mat;
            sayac ++;
        }


        System.out.print("fizik notunuz:");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam=toplam+fizik;
            sayac ++;
        }
        System.out.print("türkçe notunuz:");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam=toplam+turkce;
            sayac ++;
        }
        System.out.print("kimya notunuz:");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam=toplam+kimya;
            sayac ++;
        }
        System.out.print("müzik notunuz:");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam=toplam+muzik;
            sayac ++;
        }

        //Ortalama hesaplama

        avarage=toplam/sayac;

        if (avarage<55){
            System.out.println("Sınıfda kaldınız");
        }
        else {
            System.out.println("Sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız:"+avarage);








        }
    }
