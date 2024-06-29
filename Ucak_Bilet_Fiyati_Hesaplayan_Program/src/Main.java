import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

int km,yas,yolcutipi;
double masefeucreti=0.1,sonuc = 0,a;

        System.out.print("Mesafeyi KM Türünden Girinii:");
        km=input.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas=input.nextInt();
        System.out.print("Yolculuk Tipini Girini( 1=> Tek yön, 2 => Gidiş Dönüş)");
        yolcutipi=input.nextInt();
        if(km>0 && (yolcutipi == 1 || yolcutipi== 2)){
            if (yas<12 ){
             sonuc=km*masefeucreti*0.5;
            } else if (yas>12 && yas<24) {
                sonuc=km*masefeucreti*0.9;
                
            } else if (yas>65) {
                sonuc=km*masefeucreti*0.7;
                
            } else   {
                sonuc=km*masefeucreti;

            }


        }else{
            System.out.println("hatalı veri girdiniz");
        }
        if (yolcutipi ==2 ){
            a=sonuc*0.2;
            System.out.print("Toplam Tutar:" + (sonuc-a)*2);
        }else {
            System.out.print("toplam tutar" + sonuc );
        }


    }
}