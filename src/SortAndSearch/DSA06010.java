package SortAndSearch;

import java.util.Scanner;
import java.util.TreeSet;

public class DSA06010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -->0){
            int N = sc.nextInt();
            sc.nextLine();
            char[] s = sc.nextLine().toCharArray();
            TreeSet<Integer> set = new TreeSet<>();
            for (char c : s) {
                if (Character.isDigit(c)) set.add(c - '0');
            }
            for(int x : set){
                System.out.print(x + " ");
            } System.out.println();
        }
    }
}
