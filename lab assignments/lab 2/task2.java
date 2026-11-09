import java.io.*;
import java.util.*;

public class task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int [] arr1 = new int[n];
            int [] arr2 = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            int i =0;
            int j = m-1;
            long min = Long.MAX_VALUE;
            int besti=-1;
            int bestj = -1;
            while (i<n && j>=0){
                long sum =(long) arr1[i]+ arr2[j] ;
                long diff = Math.abs(sum-k);
                if(diff<min){
                    min = diff;
                    besti = i+1;
                    bestj = j+1;
                }

                if(diff==0){
                    break;
                }
                else if(sum<k){
                    i++;
                }
                else if (sum>k){
                    j--;
                }
            }
            pw.println(besti +" " + bestj);
        pw.flush();
    }
}