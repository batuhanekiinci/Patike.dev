import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        //indeks hesapla
        double indeks = kilo / (boy * boy);

        //yazdır
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
    }
}
