import java.io.*;
import java.util.*;

public class task7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());;
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long [] arr = new long[n];
        long low=0, high =0;
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            low = Math.max(low, arr[i]);
            high +=arr[i];
        }
        long ans =0;
        while(low<=high){
            long mid = low + (high-low)/2;
            if(check(arr, mid, k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        pw.println(ans);
        pw.flush();
    }
    public static boolean check (long[] arr , long mid, int k ){
        long sum=0, div =1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum> mid){
                div++;
                sum= arr[i];
            }
        }
        if(div<=k){
            return true;
        }
        else {
            return false;
        }
    }
}