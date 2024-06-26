package donguler;
import java.util.Scanner;

public class Cift_sayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;

        System.out.println("bir sayı giriniz");
        k=input.nextInt();
        for (int i= 1; i<=k; i++){
            if (i%2 ==0){
                System.out.println(i);
            }
        }






    }
}
