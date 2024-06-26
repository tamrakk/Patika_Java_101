package donguler;
import java.util.Scanner;

public class Ads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        for(boolean run=true; run;){
            System.out.println("Bir sayı Giriniz:");
            sayi=input.nextInt();
            if(sayi<0){
                run=false;

            }
        }

    }
}
