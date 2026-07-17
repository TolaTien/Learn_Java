import java.util.Scanner;

public class QuayLui {
    static int n;
    static int[] X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();

        X = new int[n + 1]; // dùng chỉ số từ 1 -> n cho đúng lược đồ sách

        Try(1);
        sc.close();
    }

    // Thủ tục quay lui: xét giá trị cho vị trí thứ i
    static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            X[i] = j;
            if (i == n) {
                Result();      // đã đủ n phần tử -> in kết quả
            } else {
                Try(i + 1);    // chưa đủ -> đệ quy sang vị trí tiếp theo
            }
        }
    }

    // In ra một xâu nhị phân hoàn chỉnh
    static void Result() {
        for (int i = 1; i <= n; i++) {
            System.out.print(X[i]);
        }
        System.out.println();
    }
}