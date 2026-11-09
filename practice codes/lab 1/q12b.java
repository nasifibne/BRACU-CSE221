import java.io.*;
import java.util.*;

class q12b {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            Long n = Long.parseLong(br.readLine( ));
            Long val = n;
            long reverse =0;
            while(n>0){
                long digit = n%10;
                reverse = reverse*10+digit;
                n /=10;
            }
            if(reverse == val){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        pw.flush();
        System.exit(0);
    }
}