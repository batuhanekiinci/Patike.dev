import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, alan, u;
        //kullanıcıdan kenar uzunlarını al
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenar uzunluğunu girin: ");
        a = input.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        b = input.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgeninizin Kenar Uzunluklar Toplamı : " + 2*u);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
