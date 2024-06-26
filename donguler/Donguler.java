package donguler;
import java.util.Scanner;
public class Donguler {
    public static void main(String[] args) {
        boolean password=false;
       int  a;
    Scanner input = new Scanner(System.in);


    while(!password){
        System.out.println("Şifreninizi Giriniz:");
        a=input.nextInt();
        if (a==123){
            System.out.println("şifreniz doğru");
            password=true;
        }else{
            System.out.println("şifreniz yanlış tekrar giriniz");
        }

    }









    }
}
