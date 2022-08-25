import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pearPrice, applePrice, tomatoPrice, bananaPrice, auberginePrice, total;
        pearPrice = 2.14;
        applePrice = 3.67;
        tomatoPrice = 1.11;
        bananaPrice = 0.95;
        auberginePrice = 5.00;

        double pearKg, appleKg, tomatoKg, bananaKg, aubergineKg;

        System.out.println("Armut Kaç Kilo = ");
        pearKg = input.nextDouble();
        System.out.println("Elma Kaç Kilo = ");
        appleKg=input.nextDouble();
        System.out.println("Domates Kaç Kilo = ");
        tomatoKg = input.nextDouble();
        System.out.println("Muz Kaç Kilo = ");
        bananaKg = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo = ");
        aubergineKg = input.nextDouble();

        total = (pearKg * pearPrice) +
                (appleKg * applePrice) +
                (tomatoKg * tomatoPrice) +
                (bananaKg * bananaPrice) +
                (aubergineKg * auberginePrice);

        System.out.println("Toplam Tutar = " + total);



    }
}
