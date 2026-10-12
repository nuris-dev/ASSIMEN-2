import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 100 >= 11 && n % 100 <= 14) {
            System.out.println(n  + " korov");
        } else if (n % 10 == 1) {
            System.out.println(n + " korova");
        } else if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4){
            System.out.println(n + " korovy");
        } else{
            System.out.println(n + " korov");
        }
    }
}


