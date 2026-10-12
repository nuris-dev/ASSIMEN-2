import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (k % m == 0 && k / m < n ||
                k % n == 0 && k / n < m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
