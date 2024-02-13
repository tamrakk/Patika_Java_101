package kullaniniGiris;

import java.util.Scanner;

public class KullanıcıGiris {
    public static void main(String[] args) {

        //değişken tanımlama
        String userName, password;
        String userName1 = "patika", password1 = "java123",a;
        int select;

        //kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz");
        password = input.nextLine();

        if (userName.equals(userName1) && (password.equals(password1))) {
            System.out.println("Giriş yaptınız");
        } else {
            System.out.println("Şifreniz yanlış\nŞifreyi sıfırlamak istiyorsanız: \"1\",Kapatma için \"2\"");
            select = input.nextInt();

             if (select == 1) {
                System.out.println("Yeni şifre eskisi ile aynı olamaz");
                System.out.print("Yeni şifreyi giriniz:");
                password= input.next();
                if (!password.equals(password1)) {
                    password1 = password;
                    System.out.println("Şifre Oluşturuldu");
                    System.out.println("yeni şifre: "+password1);
                } else {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    password = input.nextLine();
                    password1 = password;
                    System.out.println("Şifre Oluşturuldu");

                }

            }else {
                 System.out.println("program kapaltıldı");
             }

            }

        }


    }

