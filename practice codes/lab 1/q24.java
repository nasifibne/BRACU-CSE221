import java.io.*;
import java.util.*;

class q24 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int [] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken( ));
            }
            int maxcount=1;
            int count=1;

            for (int i = 0; i < n-1; i++) {
                    if(arr[i] < arr[i+1]){
                        count++;
                        if(count>maxcount){
                            maxcount = count;
                        }
                    }
                    else{
                        count=1;
                    }
            

            }
            pw.println(maxcount);
        }
        pw.flush();
    }
}