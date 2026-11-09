import java.io.*;
import java.util.*;

public class task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int test = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        while(0 <test--){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int left = findfirst(arr,x);
            int right= findlast(arr, y);

            if(left<=right){
                pw.println(right-left+1);
            }
            else{
                pw.println(0);
            }


            pw.flush();

        }
    }

    public static int findfirst(int[] arr , int key){
        int low =0, high = arr.length-1 ;
        int ans = arr.length;
        while(low<=high){
            int m = low+ (high-low)/2;
            if(arr[m]>= key){
                ans = m;
                high = m-1;
            }
            else{
                low = m+1;
            }
        }
        return ans;

    }
    
    public static int findlast(int[] arr , int key){
        int low =0, high = arr.length-1 ;
        int ans = -1;
        while(low<=high){
            int m = low+ (high-low)/2;
            if(arr[m]<= key){
                ans = m;
                low = m+1;
            }
            else{
                high = m-1;
            }
        }
        return ans;

    }
}