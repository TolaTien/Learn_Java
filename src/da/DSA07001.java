package da;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA07001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        while (sc.hasNext()) {
            String lenh = sc.next();
            if (lenh.equals("push")) {
                int x = sc.nextInt();
                ds.add(x);
            } else if (lenh.equals("pop")) {
                if (!ds.isEmpty()) {
                    ds.remove(ds.size() - 1);
                }
            } else if (lenh.equals("show")) {
                if (ds.isEmpty()) {
                    System.out.println("empty");
                } else {
                    for (int i = 0; i < ds.size(); i++) {
                        System.out.print(ds.get(i) + (i == ds.size() - 1 ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
