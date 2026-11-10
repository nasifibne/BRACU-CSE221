import java.io.*;
import java.util.*;

public class task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] u = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }
        int[] in = new int[n+1];
        int[] out = new int[n+1];

        for (int i = 0; i < m; i++) {
            out[u[i]]++;
            in[v[i]]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            int temp = in[i]-out[i];
            sb.append(temp).append(" ");
        }
        pw.println(sb.toString());

        pw.flush();
    }
}