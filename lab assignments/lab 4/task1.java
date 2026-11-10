import java.io.*;
import java.util.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int test = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        while (0 < test--) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = Integer.parseInt(st.nextToken());      
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }

        pw.flush();
    }
}