
import java.util.Scanner;

public class X{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bestCost = n * 15;
        int bestTrips = n;
        int b1 = n, b5 = 0, b10 = 0, b20 = 0, b60 = 0;

        for (int a = 0; a <= n / 60 + 1; a++) {
            for (int b = 0; b <= n / 20 + 1; b++) {
                for (int c = 0; c <= n / 10 + 1; c++) {
                    for (int d = 0; d <= n / 5 + 1; d++) {
                        int ost = n - a * 60 - b * 20 - c * 10 - d * 5;
                        int e = Math.max(0, ost);

                        int trips = a * 60 + b * 20 + c * 10 + d * 5 + e;
                        int cost = a * 440 + b * 230 + c * 125 + d * 70 + e * 15;

                        if (trips >= n && (cost < bestCost || (cost == bestCost && trips > bestTrips))) {
                            bestCost = cost;
                            bestTrips = trips;
                            b1 = e;
                            b5 = d;
                            b10 = c;
                            b20 = b;
                            b60 = a;
                        }
                    }
                }
            }
        }

        System.out.println(b1 + " " + b5 + " " + b10 + " " + b20 + " " + b60);
    }
}

