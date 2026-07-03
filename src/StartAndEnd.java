import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            String a = sc.nextLine();
            if(a.charAt(0) == (a.charAt(a.length() - 1))) {
                arr[i] = "YES";
            } else {
                arr[i] = "NO";
            }
        }
        for(String x : arr) {
            System.out.println(x);
        }
    }
}
