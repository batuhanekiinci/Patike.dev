import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişken
        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08,kdvTutar,kdvliTutar;

        //Değer al
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Tutar Giriniz  : ");

        tutar = input.nextDouble();
        System.out.println("Tutarınız : " + tutar);

        //kdv hesaplama
        if (tutar >= 0 && tutar <= 1000){
            kdvTutar = tutar * kdvOran1;
            System.out.println("KDV Tutarı : " + kdvTutar);

        }
        else {
            kdvTutar = tutar * kdvOran2;
            System.out.println("KDV Tutarı : " + kdvTutar);
        }
        //kdvli tutar hesapla
        kdvliTutar = tutar + kdvTutar ;
        System.out.println("KDV'li Tutarınız : "+kdvliTutar);





    }
}
