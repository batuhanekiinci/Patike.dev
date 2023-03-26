import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınız : ");
        int year = input.nextInt();

        switch (year % 12){
            case 0 :
                System.out.println("Zodiac Burcunuz : MAYMUN");
                break;
            case 1 :
                System.out.println("Zodiac Burcunuz : HOROZ");
                break;
            case 2 :
                System.out.println("Zodiac Burcunuz : KÖPEK");
                break;
            case 3 :
                System.out.println("Zodiac Burcunuz : DOMUZ");
                break;
            case 4 :
                System.out.println("Zodiac Burcunuz : FARE");
                break;
            case 5 :
                System.out.println("Zodiac Burcunuz : ÖKÜZ");
                break;
            case 6 :
                System.out.println("Zodiac Burcunuz : KAPLAN");
                break;
            case 7 :
                System.out.println("Zodiac Burcunuz : TAVŞAN");
                break;
            case 8 :
                System.out.println("Zodiac Burcunuz : EJDERHA");
                break;
            case 9 :
                System.out.println("Zodiac Burcunuz : YILAN");
                break;
            case 10 :
                System.out.println("Zodiac Burcunuz : AT");
                break;
            case 11 :
                System.out.println("Zodiac Burcunuz : KOYUN");
                break;
        }
    }
}



