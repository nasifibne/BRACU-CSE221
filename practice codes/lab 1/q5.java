
import java.io.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int t = Integer.parseInt(bf.readLine( ));

        while (t-->0){

            int n = Integer.parseInt(bf.readLine( ));

            st = new StringTokenizer(bf.readLine( ));
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }

            for(int i =0 ; i<n ; i++) {
                for (int j = 0; j < n-2; j+=2) {
                    if(arr[j] > arr[j+2]){
                        int val = arr[j];
                        arr[j] = arr[j+2];
                        arr[j+2] = val;
                    }
                }
            }

            for(int i =0 ; i<n ; i++){
                for (int j = 1; j < n-2; j+=2) {
                    if(arr[j] > arr[j+2]){
                        int val = arr[j];
                        arr[j] = arr[j+2];
                        arr[j+2] = val;
                    }
                }
            }

            boolean flag = true;

            for (int i = 0; i < arr.length-1; i++) {
                if( arr[i] > arr[i+1]){flag = false; break;}
            }

            if (flag) {
                pw.println("YES");
            }
            else pw.println("NO");
        }
        
        pw.flush();
        System.exit(0);
    }
}
