import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static  void main(String[] args) {
        int n, r, i;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kümenin eleman sayısı (n): ");
        n = scanner.nextInt();

        System.out.println("Seçilecek eleman sayısı (r): ");
        r = scanner.nextInt();

        int numerator = 1;
        for (i = 1; i <= n; i++)
            numerator *= i;

        int denominator = 1;
        for (i = 1; i <= r; i++)
            denominator *= i;

        for (i = 1; i <= n - r; i++)
            denominator *= i;
        result = numerator / denominator;
        System.out.println("C(" + n + "," + r + ") = " + result);
    }

}
