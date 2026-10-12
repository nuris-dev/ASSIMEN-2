
import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numbers.length; i++) {
            while (x >= numbers[i]) {
                System.out.print(roman[i]);
                x -= numbers[i];
            }
        }
    }
}

