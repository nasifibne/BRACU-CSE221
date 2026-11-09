import java.io.*;
import java.util.*;

public class task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            a %= m ;
            
            if(a==0){
                pw.println(0);
                continue;
            }
            if(a==1){
                pw.println(n%m);
                continue;
            }
            long sum =0 ;
            long temp = a ;
            long pow = a ;

            while (n>0) {

                if(n%2==1){
                    sum = (sum*pow + temp) %m; 
                }
                temp = (temp+(temp*pow)%m)%m;
                pow = (pow*pow)%m;

                n/=2;
            }
            pw.println(sum);
        }
        pw.flush();
    }
}