import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Bir Yıl Girin : ");
        int year = inp.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "Yılı Artık Bir Yıldır.");
        } else {
            System.out.println(year + " Yılı Artık Bir Yıl Değildir.");
        }
    }
}
