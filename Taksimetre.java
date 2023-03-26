import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double acılıs = 10, km = 2.20, indiBindi = 20, yol,ucret;

        //kullanıcıdan kaç km gitmek istediğini sor
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç KM gitmek istiyorsunuz ?");
        yol = input.nextDouble();

        //hesplamasını yap
        ucret = acılıs+(yol*km);

        if (ucret<20){
            System.out.println("Yolculuk Ücretiniz İndi Bindi Tarifesine göre : " + indiBindi);
        }
        else{

            System.out.println("Yolculuk Ücreti : " + ucret);

        }

    }
}
