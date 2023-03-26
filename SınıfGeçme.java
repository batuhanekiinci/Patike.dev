import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, toplamNot = 0, dersSayisi = 0, ortalama;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Notlarını Al
        System.out.print("Matematik Dersi Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Dersi Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Dersi Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Dersi Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Dersi Notunuz : ");
        muzik = input.nextInt();


        if (mat >= 0 && mat <= 100) {
            dersSayisi++;
            toplamNot += mat;
        } else
            System.out.println("Matematik İçin Geçersiz Bir Not Girdiniz. Matematik Notunuz Ortalamaya Dahil Edilmeyecek");
        if (fizik >= 0 && fizik <= 100) {
            dersSayisi++;
            toplamNot += fizik;
        } else System.out.println("Fizik İçin Geçersiz Bir Not Girdiniz. Fizik Notunuz Ortalamaya Dahil Edilmeyecek");
        if (kimya >= 0 && kimya <= 100) {
            dersSayisi++;
            toplamNot += kimya;
        } else System.out.println("Kimya İçin Geçersiz Bir Not Girdiniz. Kimya Notunuz Ortalamaya Dahil Edilmeyecek");
        if (turkce >= 0 && turkce <= 100) {
            dersSayisi++;
            toplamNot += turkce;
        } else System.out.println("Türkçe İçin Geçersiz Bir Not Girdiniz. Türkçe Notunuz Ortalamaya Dahil Edilmeyecek");
        if (muzik >= 0 && muzik <= 100) {
            dersSayisi++;
            toplamNot = +muzik;
        } else System.out.println("Müzik İçin Geçersiz Bir Not Girdiniz. Müzik Notunuz Ortalamaya Dahil Edilmeyecek");

        ortalama = toplamNot / dersSayisi;


        if (ortalama <= 55) {
            System.out.println("Maalesef Kaldınız!");
        } else {
            System.out.println("Tebrikler Geçtiniz!");
        }
        System.out.println("Genel Not Ortalamanız : " + ortalama);
    }
}
