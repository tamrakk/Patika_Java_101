import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi;

        System.out.print("Bir Sayı Giriniz:");
        sayi=input.nextInt();

        for (int i=0; i<=sayi; i++){

            if (i%2 ==0){
                System.out.println(i);
            }

        }


    }
}