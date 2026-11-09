import java.io.*;
import java.util.*;

class q17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine( ));
            int n =Integer.parseInt(st.nextToken( ));
            int x =Integer.parseInt(st.nextToken( ));
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for(int i = 0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                if(arr[i] == x) {
                    count++;
                }
            }
            pw.println(count);
        }
        pw.flush();
    }
}