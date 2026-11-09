import java.io.*;
import java.util.*;

public class task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = solve(arr, 0 , n-1 , sb);
        pw.println(ans.toString());
        pw.flush();
    }
    public static StringBuilder solve(int[] arr , int l , int r , StringBuilder sb){
        if(l> r){
            return sb;
        }
        int mid = l + (r-l)/2;
        sb.append(arr[mid]).append(" ");
        solve(arr, l, mid-1, sb);
        solve(arr, mid+1, r, sb);
        return sb;
    }
}