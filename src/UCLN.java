import java.util.Scanner;

public class UCLN {

    static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int BCNN(int a, int b) {
        return a / UCLN(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][2];

        for (int i = 0; i < n; i++) {
            input[i][0] = sc.nextInt(); // a
            input[i][1] = sc.nextInt(); // b
        }
        for (int i = 0; i < n; i++) {
            int a = input[i][0];
            int b = input[i][1];

            System.out.println(UCLN(a, b) + " " + BCNN(a, b));
        }
    }
}