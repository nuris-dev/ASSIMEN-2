import java.util.Scanner;

public class TaskL{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        if (k % 3 == 0 || k % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
