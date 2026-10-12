
import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A % 2 == 0 || B % 2 == 0 || C % 2 == 0) &&
                (A % 2 != 0 || B % 2 != 0 || C % 2 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

