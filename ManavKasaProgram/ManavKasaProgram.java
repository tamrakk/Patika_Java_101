package ManavKasaProgram;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args){

        // değişken tanımlama
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.0;
        double armutKilo,elmaKilo,domatesKilo,muzKilo = 0,patlıcankilo,toplam;


        //kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKilo=input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo=input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
       domatesKilo=input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcankilo=input.nextDouble();


        //formul kısmı

        toplam=(armutKilo*armut)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(patlıcankilo*patlıcan);
        System.out.print("Toplam Tutar :" + toplam + "TL");





    }
}
