import java.util.Scanner;

public class TwoExample {
    public static double log2(double x) {
        return Math.log(x) / Math.log(2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt(); // (N)количество людей на кофе-брйке.

        if (num >= 1 && num <= 2 * Math.pow(10, 9)) {
            double cake = log2(num);
            double doo = Math.ceil(cake);
            int val = (int) doo;
            System.out.println(val);
        }
    }
}
