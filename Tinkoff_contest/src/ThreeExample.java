import java.util.Scanner;

public class ThreeExample {

    // Точка отсчёта парковочный этаж, с него можно подняться на лифте на любой этаж за 0 мин..

    /* Формат входных данных:1)Колл. сотрудников, 2)ВРЕМЯ в мин. когда один сотрудник уйдет
        3) это этажи на которых находятся сотрудники, впоядке возврастания указывать,
        4)порядковый номер сотрудника (указывается по порядку), который собирается уйти.
     */
    /*
        1 ПРОЛЛЕТ = 1 МИНУТЕ
        Формат выходных данных:Минимально возможное число лестничных пролетов, которое понадобится пройти Кате.
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Колл. сотрудников.
        int t = scanner.nextInt(); // Время в мин. когда уйдет один из сотрудников.

        int[] floors = new int[n];
        for (int i = 0; i < n; i++) {
            floors[i] = scanner.nextInt(); // Цикл обозначающий(запрашивающий) на каком этаже сидит каждый сотрудник
        }

        int outgoing = scanner.nextInt(); // Уходящий сотрудник какой он посчету идет

        int res = 0;

        if (floors[outgoing-1] >= t) { // так как каждый пролет(этаж) проходится 1 мин. проверяем уходящего на каком этаже он находтся и сравниваем, со временем до его ухода
            if (floors[n-1] - floors[outgoing-1] < floors[outgoing-1] - floors[0]) {
                res += floors[n-1] - floors[outgoing-1];
            }
            else {
                res += floors[outgoing-1] - floors[0];
            }
        }

        res += floors[n-1] - floors[0];

        System.out.println(res);
    }
}