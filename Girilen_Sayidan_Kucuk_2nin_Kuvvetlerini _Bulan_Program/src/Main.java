import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Sınır sayısını Giriniz:");
        n=input.nextInt();
        System.out.println("4'nün Kuvvetleri");
        for (int i=1; i<=n; i*=4){
            System.out.println(i);

        }
        System.out.println("5'nün Kuvvetleri");
        for (int i=1; i<=n; i*=5){
            System.out.println(i);

        }




        }
    }
