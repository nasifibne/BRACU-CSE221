import java.io.*;
import java.util.*;

public class task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        st = new StringTokenizer (br.readLine());
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        int l = 0;
        int sum =0;
        int maxlength=0;
        for (int r = 0; r < n; r++) {
            sum+=arr[r];
            while(sum>k){
                sum -=arr[l];
                l++;
            }
            maxlength = Math.max(maxlength, r-l+1);
        }
        pw.println(maxlength);
        pw.flush();
    }
}