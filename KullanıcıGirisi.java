import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.next();
        System.out.print("Şifreniz : ");
        password = input.next();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız.");

            //Kullanıcı doğru şifre yanlışsa
        } else if ((userName.equals("patika") && !password.equals("java101"))) {
            System.out.println("Şifreniz yanlış!");

            //Şifreyi sıfırlamak isteyip istemediğini sor
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ?\n1- Şifrenizi Sıfırlamak için 1'i Seçiniz \n2- İşlemi sonlandırmak için 2'yi Seçiniz ");
            int secim = input.nextInt();

            switch (secim) {
                case 1: //şifreyi sıfırla
                    System.out.print("Yeni şifrenizi Giriniz : ");
                    String password2 = input.next();
                    if (password2.equals("java101")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                    } else {
                        System.out.println("Şifre oluşturuldu.\nTekrar Giriş Yapmayı Deneyebilirsiniz.");
                    }
                    break;
                case 2: //işlemi sonlandır
                    System.out.println("İşleminiz Sonlandırılmıştır.");
                    break;
            }
            //kullanıcı adı veya şifre yanlışsa
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış! \n Lütfen Tekrar Deneyiniz.");
        }
    }
}
