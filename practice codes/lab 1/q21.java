import java.io.*;
import java.util.*;

class q21 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine( ));
            int n = Integer.parseInt(st.nextToken( ));
            int x = Integer.parseInt(st.nextToken( ));
            int [] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for(int i =0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }

            int maxsum =Integer.MIN_VALUE;
            for(int i =0; i < n-x+1 ; i++){
                int sum=0;
                for(int j = i ; j < i+x ; j++){
                    sum +=arr[j];
                }
                if(sum>maxsum ){
                    maxsum = sum; 
                }
            }
            pw.println(maxsum);

        }
        pw.flush();
    }
}