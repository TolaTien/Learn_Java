import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] a = new int[105];
    static int[] x = new int[105]; // Lưu chỉ số các phần tử được chọn
    static int ans = 0;

    static void Try(int i) {
        // Chỉ số tiếp theo phải lớn hơn chỉ số trước đó
        for (int j = x[i - 1] + 1; j <= n - k + i; j++) {
            // Nhánh cận: giá trị phần tử sau phải lớn hơn phần tử trước
            if (a[j] > a[x[i - 1]]) {
                x[i] = j;
                if (i == k) {
                    ans++;
                } else {
                    Try(i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // a[0] = 0 đóng vai trò phần tử lính canh ban đầu (do các phần tử trong a[] > 0)
        a[0] = 0;
        x[0] = 0;

        Try(1);

        System.out.println(ans);
    }
}