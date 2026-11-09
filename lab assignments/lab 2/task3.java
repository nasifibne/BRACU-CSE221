import java.io.*;
import java.util.*;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int i=0;
        int j =0;
        int[] output = new int[n+m];
        int k =0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                output[k++] = arr1[i];
                i++;
            }
            else if (arr1[i] >= arr2[j]){
                output[k++] = arr2[j];
                j++;
            }
        }
        
        while(i<n){
            output[k++] = arr1[i];
            i++;
        }
        while(j<m){
            output[k++] = arr2[j];
            j++;
        }

        for (int p = 0; p < k; p++) {
            pw.print(output[p] + " ");
        }
        pw.flush();
    }
}