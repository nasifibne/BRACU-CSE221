import java.io.*;
import java.util.*;

class q13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            Long n = Long.parseLong(br.readLine( ));
            int div=0;

            for (int i = 1; i<=n; i++) {
                if(n%i==0){
                    div++;
                }                
            }
            pw.println(div);
        }
        pw.flush();
        System.exit(0);
    }
}