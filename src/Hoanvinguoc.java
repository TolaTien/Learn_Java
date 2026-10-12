import java.util.Scanner;

public class Hoanvinguoc {

    static boolean prevPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] <= a[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = a.length - 1;
        while (a[j] >= a[i]) {
            j--;
        }
        swap(a, i, j);
        int l = i + 1;
        int r = a.length - 1;
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
        return true;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a) {
        for (int x : a) {
            System.out.print(x);
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = n - i;
            }
            while (true) {
                printArray(a);
                if (!prevPermutation(a)) {
                    break;
                }
            }
            System.out.println();
        }
    }
}