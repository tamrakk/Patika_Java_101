package donguler;
import java.util.Scanner;

public class Dowhileee {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean kontpassword=true;
        int password;

        do{
            System.out.println("Şifrennizi giriniz:");
            password=input.nextInt();
            if (password==123){
                System.out.println("doğru");
                kontpassword=false;
            }else{
                System.out.println("yanlış");
            }


        }while (kontpassword);

    }
}
