import java.io.*;
import java.util.*;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        long ans = power(x,y,107);
        pw.println(ans);
        pw.flush();
    }
    public static long power(long x , long y , long mod){
        long ans =1;
        x = x%mod;

        while(y>0){
            if(y%2==1){
                ans = (ans*x) % mod;
            }
            x = (x*x) %mod;
            y /=2;
        }
        return ans;       

    }
}