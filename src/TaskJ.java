import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // Если числитель всегда равен 0
        if (a == 0 && b == 0) {
            // Тогда нужно проверить знаменатель.
            // cx + d не может быть равен 0 для всех x,
            // поэтому решений бесконечно много.
            System.out.println("INF");
        }

        // Если a = 0, но b != 0
        else if (a == 0) {
            System.out.println("NO");
        }

        // Обычный случай: a != 0
        else {
            if (-b % a != 0) {
                System.out.println("NO");
            } else {
                int x = -b / a;

                // Проверяем, что знаменатель не равен 0
                if (c * x + d == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println(x);
                }
            }
        }
    }
}
