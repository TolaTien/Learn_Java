import java.util.Scanner;

public class DSA01004 {
    static void result(int[] a) {
        String s = "";
        for(int x : a) {
            s += x;
        }
        System.out.print(s +" ");
    }
    static void next_combination(int n, int k){
        int[] arr = new int[k];
        for(int i = 1; i <= k; i++) {
            arr[i -1] = i;
        }
        while (true) {
            result(arr);
            int i = k - 1;
            while (i >= 0 && arr[i] == n - k + i + 1) {
                i--;
            }
            if (i < 0) break;
            arr[i] ++;
            for(int j = i + 1; j < k; j++) {
                arr[j] = arr[j-1] +1;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            next_combination(sc.nextInt(), sc.nextInt());
        }
    }
}
