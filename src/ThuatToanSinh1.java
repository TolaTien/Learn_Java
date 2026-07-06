import java.util.Scanner;

public class ThuatToanSinh1 {
    static void result(int[] a) {
        for(int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i = 1; i <= k; i++) {
            arr[i - 1] = i;
        }
        while (true) {
            result(arr);
            int i = k - 1;
            while (i >= 0 && arr[i] == n - k + i + 1) {
                i--;
            }

            if(i < 0) break;
            arr[i]++;
            for(int j = i + 1; j < k; j++) {
                arr[j] = arr[j-1] + 1;
            }
        }

    }
}
