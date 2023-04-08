import java.util.Scanner;

public class OneExample {
    static Scanner scanner = new Scanner(System.in);

    public static void numbers() {
        int A = scanner.nextInt(); // абонентская плата в месяц
        int B = scanner.nextInt(); // мегабайт интернет трафика
        int C = scanner.nextInt(); // значение каждого мегабайт трафика за пределами лимита
        int D = scanner.nextInt(); // планирует потратить значение
        int sum = A;
        if (D - B > 0) {
            sum += (D - B) * C;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        numbers();
    }
}