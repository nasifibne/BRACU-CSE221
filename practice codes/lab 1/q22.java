import java.io.*;
import java.util.*;

public class q22 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine( ));
            int n = Integer.parseInt(st.nextToken( ));
            int s = Integer.parseInt(st.nextToken( ));

            st = new StringTokenizer(br.readLine( ));
            int[] arr = new int[n];
            for(int i =0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }
            int count=0;
            for (int i =0 ; i<n-1 ; i++){
                for(int j = i+1 ; j<n ; j++){
                    if((arr[i] + arr[j] )== s){
                        count++;
                    }
                }
            }
            pw.println(count);
        }
        pw.flush();
    }
}