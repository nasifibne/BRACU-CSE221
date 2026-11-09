import java.io.*;
import java.util.*;

class q19 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for(int i =0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));

            }
            int [] out = new int[n];
            int count=0;
            for (int i = 0; i < n; i++) {
                if(arr[i] != 0){
                    out[count++] = arr[i];
                }
            }
            for (int i = 0; i < out.length; i++) {
                pw.print(out[i] + " ");
            }
            pw.println();
        }
        pw.flush();
    }
}