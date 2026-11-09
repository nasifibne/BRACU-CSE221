import java.io.*;
import java.util.*;

public class task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        long[] temp = new long[n+1];
        int l =0;
        int dis = 0;
        int maxlength=0;
        for (int r = 0; r < n; r++) {
            int right = arr[r];
            if(temp [right] ==0){
                dis++;
            }
            temp[right]++;
            while (dis>k) {
                int left = arr[l];
                temp[left]--;
                if(temp[left]==0){
                    dis--;
                }
                l++;
            }
            maxlength= Math.max(maxlength, r-l+1);
        }
        pw.println(maxlength);
        
        pw.flush();
    }
}