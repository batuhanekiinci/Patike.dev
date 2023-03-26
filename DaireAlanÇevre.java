import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        //Kullanıcıdan Yarıçap ve Açı bilgilerini al
        System.out.print("Dairenin Yarıçapı : ");
        double r = input.nextDouble();
        System.out.print("Daire Diliminin Açısı : ");
        int a = input.nextInt();

        double cevre = (2 * pi * r) * a / 360;
        double alan = (pi * r * r) * a / 360;

        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dairenin Alanı : " + alan);

    }
}
