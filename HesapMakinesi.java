import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,select,sonuc;

        //kullanıcıdan sayıları al
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        //İşlem Seç
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select){
            case 1:
                sonuc = n1+n2 ;
                System.out.println(n1 + "+" + n2 + "=" + sonuc);
                break;
            case 2:
                sonuc = n1-n2 ;
                System.out.println(n1 + "-" + n2 + "=" + sonuc);
                break;
            case 3:
                sonuc = n1*n2;
                System.out.println(n1 + "x" + n2 + "=" + sonuc);
                break;
            case 4:
                if (n2 ==0){
                    System.out.println("Bir Sayının Sıfıra Bölümü Tanımsızdır");
                    break;
                }
                sonuc = n1 / n2;
                System.out.println(n1 + "/" + n2 + "=" + sonuc);
                break;

            default:
                System.out.println("Geçersiz bir sayı seçtiniz.");

        }

    }
}
