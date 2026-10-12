import java.util.Scanner;
public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("impossible");
        } else{
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else if (a * a + b * b > c * c) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}