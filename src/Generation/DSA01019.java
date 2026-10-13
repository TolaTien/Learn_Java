package Generation;

import java.util.Scanner;

public class DSA01019 {
    static int N;
    static char[] a;
    static void Try(int i ){
        if( i == N - 1){
            a[N - 1] = 'A';
            System.out.println(new String(a));
            return;
        }
        a[i] = 'A';
        Try(i+ 1);
        if(a[i - 1] != 'H'){
            a[i] = 'H';
            Try(i +1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            N = sc.nextInt();
            a = new char[N];
            a[0] = 'H';
            Try(1);
        }
    }
}


//import java.util.Scanner;
//
//public class DSA01019 {
//    static int N;
//    static char[] a;
//
//    // Kiểm tra toàn bộ điều kiện của xâu
//    static boolean check() {
//        // Điều kiện 1: Ký tự đầu là 'H', ký tự cuối là 'A'
//        if (a[0] != 'H' || a[N - 1] != 'A') {
//            return false;
//        }
//
//        // Điều kiện 2: Không có hai chữ 'H' liền kề nhau
//        for (int i = 0; i < N - 1; i++) {
//            if (a[i] == 'H' && a[i + 1] == 'H') {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // Đệ quy sinh nhị phân từ vị trí 0 đến N - 1
//    static void Try(int i) {
//        if (i == N) {
//            if (check()) {
//                System.out.println(new String(a));
//            }
//            return;
//        }
//
//        // Nhánh 1: chọn 'A'
//        a[i] = 'A';
//        Try(i + 1);
//
//        // Nhánh 2: chọn 'H'
//        a[i] = 'H';
//        Try(i + 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        if (!sc.hasNextInt()) return;
//        int T = sc.nextInt();
//        while (T-- > 0) {
//            N = sc.nextInt();
//            a = new char[N];
//            Try(0);
//        }
//        sc.close();
//    }
//}