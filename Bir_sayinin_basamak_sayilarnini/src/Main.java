import java.util.Scanner;
public class Main {
    public static <numbercounter> void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,basamaksayisi=0,numbercounter=0,basvalue,total=0;

        System.out.print("Sayıyı Giriniz:");
        number=input.nextInt();


        while(number != 0){
            basvalue=number%10;
           // System.out.println(basvalue);
            total+=basvalue;
             number/=10;
            numbercounter++;

        }
        //System.out.println(numbercounter);
        System.out.println(total);

        }
    }


