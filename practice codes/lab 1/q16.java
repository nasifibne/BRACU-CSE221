import java.io.*;
import java.util.*;

class q16 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            Long[] arr = new Long[n];
            st = new StringTokenizer(br.readLine( ));
            
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken( ));
            }

            // Step 1: Find the largest value in the array
            long maxVal = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            
            // Step 2: Find the largest value that is strictly less than maxVal
            long secondMax = Long.MIN_VALUE;
            boolean found = false;
            
            for (int i = 0; i < n; i++) {
                if (arr[i] < maxVal && arr[i] > secondMax) {
                    secondMax = arr[i];
                    found = true;
                }
            }
            
            // Step 3: Print result
            if (found) {
                pw.println(secondMax);
            } else {
                pw.println(-1); // No second distinct value exists
            }

        }
        pw.flush();
        System.exit(0);
    }
}