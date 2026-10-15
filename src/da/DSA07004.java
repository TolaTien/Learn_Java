package da;

import java.util.Scanner;
import java.util.Stack;

public class DSA07004 {
    static int tinh(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(c);
                }
            } else {
                st.push(c);
            }
        }
        int dong = 0, mo = 0;
        while (!st.isEmpty()) {
            if (st.pop() == ')') {
                dong++;
            } else {
                mo++;
            }
        }
        return (dong + 1) / 2 + (mo + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            System.out.println(tinh(s));
        }
        sc.close();
    }
}
