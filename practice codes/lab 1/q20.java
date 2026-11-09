import java.io.*;
import java.util.*;

class q20 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int [] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for(int i = 0 ; i<n ;i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }
            int val = arr[n-1];
            for(int i = n-1 ; i>0 ; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = val;
            
            pw.println(Arrays.toString(arr));
        }
        pw.flush();
    }
}