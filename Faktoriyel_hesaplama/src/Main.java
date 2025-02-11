import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz:");
        a=input.nextInt();

        for (int i =1; i<=a; i++){
            b=i*b;

        }
        System.out.println(b);


    }
}