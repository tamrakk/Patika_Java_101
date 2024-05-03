package Hava_SıcakliginaGoreEtkinlikOnerderenProgram;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int heat;
        Scanner input =new Scanner(System.in);
        System.out.print("Hava Sıçaklığını Girniniz;");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if(heat>=5 && heat<=15){
            System.out.println("Sinemaya Giderbilirsiniz");

            if (heat>=10){
                System.out.println("pikniğe gidebilirsiniz");
             }
        } else if (heat>15 && heat<=25) {
            System.out.println("Pikniğe gidebilirsiniz");

        } else{
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
