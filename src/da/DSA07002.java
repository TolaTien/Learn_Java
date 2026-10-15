package da;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DSA07002 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dong = br.readLine();
        if (dong == null) return;
        int q = Integer.parseInt(dong.trim());
        int[] st = new int[q + 5];
        int dinh = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            String lenh = br.readLine();
            if (lenh == null) break;
            StringTokenizer stz = new StringTokenizer(lenh);
            if (!stz.hasMoreTokens()) continue;
            String tuKhoa = stz.nextToken();
            if (tuKhoa.equals("PUSH")) {
                int x = Integer.parseInt(stz.nextToken());
                st[dinh++] = x;
            } else if (tuKhoa.equals("POP")) {
                if (dinh > 0) {
                    dinh--;
                }
            } else if (tuKhoa.equals("PRINT")) {
                if (dinh == 0) {
                    sb.append("NONE\n");
                } else {
                    sb.append(st[dinh - 1]).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
