import java.io.*;
import java.util.*;

class q15 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine( ));
            Long a = Long.parseLong(st.nextToken( ));
            Long b = Long.parseLong(st.nextToken( ));

            Long gcd = gcd(a, b);

            Long lcm = (a/gcd)*b;

            pw.println(gcd +" "+ lcm );

        }
        pw.flush();
        System.exit(0);
    }
    static Long gcd (Long a , Long b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

}