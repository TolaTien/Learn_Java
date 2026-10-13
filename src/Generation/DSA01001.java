package Generation;

import java.util.Arrays;
import java.util.Scanner;

public class DSA01001 {
        static int[] revert(String s){
            int[] a  = new int[s.length()];
            for(int i = 0; i < s.length(); i++) {
                a[i] = s.charAt(i) -'0';
            }
            return  a;
        }
    static boolean next_binary(int[] a){
            int i = a.length - 1;
            while (i>=0 && a[i] == 1){
                a[i] = 0;
                i--;
            }
            if(i< 0) return  false;
            a[i] = 1;
            return true;
    }
    static String join(int[] a) {
            String s = "";
            for(int i = 0; i < a.length; i++){
                s+= a[i];
            }
            return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T --> 0) {
            String s = sc.nextLine();
            int[] a = revert(s);
            next_binary(a);
            System.out.println(join(a));
        }
    }

    public static class DSA04020 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) return;

            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int idx = Arrays.binarySearch(a, k);
                if (idx >= 0) {
                    System.out.println(idx + 1); // Đề bài tính chỉ số từ 1
                } else {
                    System.out.println("NO");
                }
            }
            sc.close();
        }
    }
}
