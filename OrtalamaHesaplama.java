import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //değişkenler
        int mat, fizik, tarih, kimya, muzik, turkce;

        //Scanner sınıfı
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();

        //işlemleri yap
        int toplam = mat + fizik + tarih + kimya + muzik + turkce;
        double sonuc = toplam / 6;

        if (sonuc > 60)
            System.out.println("Tebrikler Geçtiniz Ortalamanız : " + sonuc);
        else
            System.out.println("Maalesef Kaldınız"+ "Ortalamanız : "  + sonuc);


    }
}
