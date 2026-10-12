import java.io.*;
import java.util.*;

class task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test, n;
        String ans = "";
        test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // input
            if( n %2 ==0){
                ans = (n + " is an Even number.");
            }
            else{
                ans = (n + " is an Odd number.");
            }
            pw.println(ans); // output
        }
        pw.flush();
        System.exit(0);
    }
}