package Giris;

public class Degiskenler {
    public static void main(String[] args) {

        int numberOne,numberTwo=3,numberThree;
        numberOne = 3;
        numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        int uzunKenar=12,kısaKenar=9;
        int alan=uzunKenar*kısaKenar;
        int cevre=2*(uzunKenar+kısaKenar);
        System.out.println(alan);
        System.out.println(cevre);


        byte vByte=100;
        short vShort=1000;
        int vInterger=10000;
        long vLong=100000;
        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInterger);
        System.out.println(vLong);

        float pi=3.14f;
        double pi2=12;
        System.out.println(pi);
        System.out.println(pi2);

        char c1='j';
        char c2='a';
        char c3='v';
        char c4='a';
        System.out.println(""+c1+c2+c3+c4);

        boolean dogru=true;
        boolean yanlıs=false;
        System.out.println(dogru);
        System.out.println(yanlıs);


        String vStr="java101 patika";
        System.out.println(vStr);

    }
}
