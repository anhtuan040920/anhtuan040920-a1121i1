package Bai1.bai_tap;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Ungdungchuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you need to convert: ");
        double usd = sc.nextDouble();
        int rate = 23000;
        double vnd;

        vnd = usd * rate;

        String currencyUsd = NumberFormat.getCurrencyInstance(Locale.US).format(usd);
        String currencyVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(vnd);

        System.out.println(currencyUsd + " = " + currencyVN);
    }
}
