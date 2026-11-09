import java.io.*;
import java.util.*;

public class task4alt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        String first = next();
        if (first == null) return;

        int test = Integer.parseInt(first);
        StringBuilder sb = new StringBuilder();
        long mod = 1000000007L;

        while (test-- > 0) {
            long a00 = Long.parseLong(next()) % mod;
            long a01 = Long.parseLong(next()) % mod;
            long a10 = Long.parseLong(next()) % mod;
            long a11 = Long.parseLong(next()) % mod;
            long x = Long.parseLong(next());

            long r00 = 1, r01 = 0;
            long r10 = 0, r11 = 1;

            while (x > 0) {
                if (x%2 !=0 ) {
                    long n00 = (r00 * a00 + r01 * a10) % mod;
                    long n01 = (r00 * a01 + r01 * a11) % mod;
                    long n10 = (r10 * a00 + r11 * a10) % mod;
                    long n11 = (r10 * a01 + r11 * a11) % mod;
                    r00 = n00; r01 = n01;
                    r10 = n10; r11 = n11;
                }

                long n00 = (a00 * a00 + a01 * a10) % mod;
                long n01 = (a00 * a01 + a01 * a11) % mod;
                long n10 = (a10 * a00 + a11 * a10) % mod;
                long n11 = (a10 * a01 + a11 * a11) % mod;
                a00 = n00; 
                a01 = n01;
                a10 = n10; 
                a11 = n11;

                x /=2;
            }

            sb.append(r00).append(' ').append(r01).append('\n');
            sb.append(r10).append(' ').append(r11).append('\n');

            if (sb.length() > 65536) {
                pw.print(sb);
                sb.setLength(0);
            }
        }
        pw.print(sb);
        pw.flush();
    }
}