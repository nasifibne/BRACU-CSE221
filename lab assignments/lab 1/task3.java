import java.io.*;
import java.util.*;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test; 
        long n, ans;
        test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // input
            ans = (n*(n+1))/2; // solution
            pw.println(ans); // output
        }
        pw.flush();
        System.exit(0);
    }
} 