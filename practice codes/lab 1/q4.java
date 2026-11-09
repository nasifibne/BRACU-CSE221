
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class q4{
    public static void main(String[] args) throws  Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int t = Integer.parseInt(bf.readLine( ));
        while (t-->0){
            int n = Integer.parseInt(bf.readLine( ));
            int[] arr = new int[n];
            
            st = new StringTokenizer(bf.readLine( ));

            for( int i = 0 ; i<n ; i++){
                arr[i] = Integer.parseInt(st.nextToken( ));
            }

            boolean flag = true;
            for (int i = 0; i < n -1 ; i++) {
                if(arr[i] > arr[i+1]) {
                    flag = false;
                    break;
                }
            }

            if(flag ) {
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }


        }
        pw.flush();
    }
}