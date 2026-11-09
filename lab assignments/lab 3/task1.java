import java.io.*;
import java.util.*;

public class task1 {
    
    public static long count=0;
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
        int[] temp = new int[n];

        mergesort(arr, temp , 0 ,n-1);

        pw.println(count);
        for (int i = 0; i < n; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();
        pw.flush();
    }
    public static void mergesort(int[] arr , int[]temp , int l , int r){
       if(l>= r){
        return ;
       }
       int mid = l + (r-l)/2;
       mergesort(arr, temp, l , mid);
       mergesort(arr, temp, mid+1 , r);

       merge(arr, temp , l, mid , r);

    }
    public static void merge(int[] arr , int[]temp , int l , int mid, int r){
        int i = l;
        int j = mid+1;
        int k = l;

        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                count += (mid+1-i);
            }
        }
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=r) {
            temp[k++] = arr[j++];
        }
        for (int p = l; p <= r ; p++) {
            arr[p] = temp[p];
        }
    }
}