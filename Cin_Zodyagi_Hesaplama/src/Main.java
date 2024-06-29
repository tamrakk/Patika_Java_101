
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumyili,a;
        System.out.print("Doğum yılınızı giriniz:");
        dogumyili=input.nextInt();
        a=dogumyili%12;
        switch (a) {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz: Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz: Horoz");
            break ;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz: Köpek");
                break ;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz: domuz");
                break ;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz: Fare");
                break ;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz: Öküz");
                break ;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz: kaplan");
                break ;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz: Tavşan");
                break ;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz: Ejderha");
                break ;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz: Yılan");
                break ;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz: At");
                break ;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz: Koyun");
                break ;
            default:
                System.out.println("hatalı sonuç");
                break;



        }
    }
}