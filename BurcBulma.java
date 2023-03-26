import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int month, day;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz Gün (1-31) : ");
        day = inp.nextInt();

        System.out.print("Doğduğunuz Ay (1-12) : ");
        month = inp.nextInt();

        String burc = "";

        if (month == 1) {
            if (day <= 21) {
                burc = "Oğlak";
            } else if (day <= 31) {
                burc = "Kova";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        } else if (month == 2) {
            if (day <= 19) {
                burc = "Kova";
            } else if (day <= 29) {
                burc = "Balık";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 3) {
            if (day <= 20) {
                burc = "Balık";
            } else if (day <= 31) {
                burc = "Koç";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 4) {
            if (day <= 20) {
                burc = "Koç";
            } else if (day <= 30) {
                burc = "Boğa";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 5) {
            if (day <= 21) {
                burc = "Boğa";
            } else if (day <= 31) {
                burc = "İkizler";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 6) {
            if (day <= 22) {
                burc = "İkizler";
            } else if (day <= 30) {
                burc = "Yengeç";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 7) {
            if (day <= 22) {
                burc = "Yengeç";
            } else if (day <= 31) {
                burc = "Aslan";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 8) {
            if (day <= 22) {
                burc = "Aslan";
            } else if (day <= 31) {
                burc = "Başak";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 9) {
            if (day <= 22) {
                burc = "Başak";
            } else if (day <= 30) {
                burc = "Terazi";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 10) {
            if (day <= 22) {
                burc = "Terazi";
            } else if (day <= 31) {
                burc = "Akrep";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 11) {
            if (day <= 21) {
                burc = "Akrep";
            } else if (day <= 31) {
                burc = "Yay";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else if (month == 12) {
            if (day <= 21) {
                burc = "Yay";
            } else if (day <= 31) {
                burc = "Oğlak ";
            } else {
                burc = "Yanlış Bir Tarih Girdiniz.";
            }
        }else burc = "Yanlış Bir Tarih Girdiniz.";
        System.out.println("Burcunuz : " + burc);
    }
}