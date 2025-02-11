import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total1=1,total2=1,total3=1,total,n,r,nr;

        System.out.print("eleman sayısını giriniz(n):");
        n=input.nextInt();
        System.out.print("seçim  sayıyını giriniz(r):");
        r=input.nextInt();

        for(int i=1; i<=n; i++){
            total1=total1*i;
        }
        for(int k=1; k<=r; k++){
            total2=total2*k;
        }
        nr=n-r;
        for (int y=1; y<=nr; y++){
            total3=total3*y;
        }
        total=total1/(total2*total3);

        System.out.println("C("+n+","+r+"):"+total);

    }
}