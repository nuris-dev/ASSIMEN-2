
import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int best = n * 15;
        int best1 = n, best10 = 0, best60 = 0;

        for (int a = 0; a <= n / 60 + 1; a++) {
            for (int b = 0; b <= n / 10 + 1; b++) {
                int c = n - a * 60 - b * 10;

                if (c < 0) {
                    c = 0;
                }

                int cost = a * 440 + b * 125 + c * 15;

                if (a * 60 + b * 10 + c >= n && cost < best) {
                    best = cost;
                    best1 = c;
                    best10 = b;
                    best60 = a;
                }
            }
        }

        System.out.println(best1 + " " + best10 + " " + best60);
    }
}
