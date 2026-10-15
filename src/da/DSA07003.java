package da;

import java.util.Scanner;
import java.util.Stack;

public class DSA07003 {
    static boolean kiemTra(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                boolean coToanTu = false;
                while (!st.isEmpty() && st.peek() != '(') {
                    char dinh = st.pop();
                    if (dinh == '+' || dinh == '-' || dinh == '*' || dinh == '/') {
                        coToanTu = true;
                    }
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                if (!coToanTu) {
                    return true;
                }
            } else {
                st.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (kiemTra(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
