import java.io.*;
import java.util.*;

public class task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());;
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        long low=1, high =0;
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            high = Math.max(high, arr[i]);
        }
        long ans=-1;
        while(low<=high){
            long mid = low+ (high-low)/2;
            if(check(arr, mid, k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        pw.println(ans);

        pw.flush();
    }
    public static boolean check(long[] arr , long mid , long k){
        long div =0;
        for (int i = 0; i < arr.length; i++) {
            div+=(arr[i]/mid);
        }
        if(div>=k){
            return true;
        }
        else{
            return false;
        }
    }
}