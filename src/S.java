
import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // начальный столбец
        int b = sc.nextInt(); // начальная строка
        int c = sc.nextInt(); // конечный столбец
        int d = sc.nextInt(); // конечная строка

        if (Math.abs(a - c) <= 1 && Math.abs(b - d) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

