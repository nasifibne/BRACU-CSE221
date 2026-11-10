import java.io.*;
import java.util.*;

public class task8 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] adj = new int[n+1][n+1];
        int[] count = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i!=j && gcd(i, j)==1){
                    adj[i][count[i]] = j;
                    count[i]++;
                }
            }
        }

        while(0< q--){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if(k<= count[x]){
                pw.println(adj[x][k-1]);
            }
            else{
                pw.println(-1);
            }
        }
        pw.flush();
    }
}