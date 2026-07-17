import java.util.Scanner;

public class Main {
    static  int n;
    static  int[] arr;
    static void printArray(int[] a){
        String s = "";
        for(int x: a){
            s+= x + " ";
        }
        System.out.println(s);
    }
    static boolean check(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            if(a[i] != a[a.length - i - 1]) return false;
        }
        return true;
    }
    static void Try(int i){
        for(int j = 0; j <= 1; j++){
            arr[i] = j;
            if(i == n - 1) {
                if (check(arr)) printArray(arr);
            } else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        Try(0);
    }
}