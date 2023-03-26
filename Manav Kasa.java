import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //meyve, sebzeleri ve birim fiyatlarını tanımla
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kaçar kilo aldıklarını sor
        System.out.print("Kaç kilo armut aldınız : ");
        double armutKg = input.nextDouble();
        double armutTutar = armut * armutKg;
        System.out.println("Aldığınız armutun tutarı : " + armutTutar);

        System.out.print("Kaç kilo elma aldınız : ");
        double elmaKg = input.nextDouble();
        double elmaTutar = elma * elmaKg;
        System.out.println("Aldığınız elmanın tutarı : " + elmaTutar);

        System.out.print("Kaç kilo domates aldınız : ");
        double domatesKg = input.nextDouble();
        double domatesTutar = domates * domatesKg;
        System.out.println("Aldığınız domatesin tutarı : " + domatesTutar);

        System.out.print("Kaç kilo muz aldınız : ");
        double muzKg = input.nextDouble();
        double muzTutar = muz * muzKg;
        System.out.println("Aldığınız muzun tutarı : " + muzTutar);

        System.out.print("Kaç kilo patlıcan aldınız : ");
        double patlicanKg = input.nextDouble();
        double patlicanTutar = patlican * patlicanKg;
        System.out.println("Aldığınız patlıcanın tutarı : " + patlicanTutar);

        //Hesapla
        double tutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;
        System.out.println("Toplam ödemeniz gereken tutar : " + tutar);


    }
}
