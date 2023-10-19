import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int sum = 0; // Toplamı saklamak için bir değişken
        int count = 0; // Bölünen sayıları saymak için bir değişken

        System.out.print("3 ve 4'e tam bölünen sayılar: ");
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                System.out.print(i + " ");
                sum += i; // 3 ve 4'e tam bölünen sayıları topla
                count++;  // Bölünen sayıların sayısını artır
            }
        }

        System.out.println(); // Satır sonu

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
