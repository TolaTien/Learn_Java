import java.util.Scanner;

public class Main {
    static int[] A;
    static int N, K;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        findSubsets(0, 0, new int[N], 0);
        System.out.println(count);
    }

    static void findSubsets(int index, int sum, int[] subset, int size) {
        if (sum == K) {
            for (int i = 0; i < size; i++)
                System.out.print(subset[i] + (i < size - 1 ? " " : ""));
            System.out.println();
            count++;
            return;
        }
        if (index == N || sum > K) return;

        findSubsets(index + 1, sum, subset, size);

        subset[size] = A[index];
        findSubsets(index + 1, sum + A[index], subset, size + 1);
    }
}