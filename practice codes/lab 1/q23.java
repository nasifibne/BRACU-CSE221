import java.io.*;
import java.util.*;

class q23 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int [] arr = new int[n];

            st= new StringTokenizer(br.readLine( ));
            for(int i = 0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }
            int[] check = new int[n+1];
            for(int i =0 ; i<n+1 ;i++){
                check[i] = (i+1);
            }
            int val =-1;
            if(arr[n-1] != check[n]){
                val = check[n];
            }
            for(int i =0 ; i<n ; i++){
                
                if(arr[i] != check[i] ){
                    val = check[i];
                    break;
                }
                
            }
            pw.println(val);
        }
        pw.flush();
    }
}