import java.util.Scanner;

public class TsakC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (Math.abs(a - c) == Math.abs(b - d)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
