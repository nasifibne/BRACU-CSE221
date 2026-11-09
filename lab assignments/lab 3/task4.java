import java.io.*;
import java.util.*;

public class task4 {
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

        if(first == null ) return ;
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(first);
        while (0 < test--) {
            long[][] a = new long[2][2];
            a[0][0] = Long.parseLong(next());
            a[0][1] = Long.parseLong(next());
            a[1][0] = Long.parseLong(next());
            a[1][1] = Long.parseLong(next());
            long x = Long.parseLong(next());

            long[][] ans = power(a,x);

            sb.append(ans[0][0]).append(' ').append(ans[0][1]).append('\n');
            sb.append(ans[1][0]).append(' ').append(ans[1][1]).append('\n');
            if(sb.length()> 65536){
                pw.print(sb);
                sb.setLength(0);
            }
        }
        pw.print(sb);
        pw.flush();
    }
    public static long[][] power(long [][] a , long x){
        long[][] ans = {
            {1,0},
            {0,1}
        };

        long mod = 1000000007;

        a[0][0] = a[0][0] % mod;
        a[0][1] = a[0][1] % mod;
        a[1][0] = a[1][0] % mod;
        a[1][1] = a[1][1] % mod;

        while(x>0){
            if(x%2 != 0){
                ans = multi(ans , a);
            }
            a = multi(a ,a);
            x /= 2;
        }
        return ans;
    }

    public static long[][] multi (long[][] a , long[][] b){
        long mod = 1000000007;
        long[][] ans = new long[2][2];
        ans[0][0] = (a[0][0] * b[0][0] + a[0][1] *b[1][0]) % mod;
        ans[0][1] = (a[0][0] * b[0][1] + a[0][1] *b[1][1]) % mod;
        ans[1][0] = (a[1][0] * b[0][0] + a[1][1] *b[1][0]) % mod;
        ans[1][1] = (a[1][0] * b[0][1] + a[1][1] *b[1][1]) % mod;

        return ans;
    }
} 
    

