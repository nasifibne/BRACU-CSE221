import java.io.*;
import java.util.*;

class q7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int[] id = new int[n];
            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine( ));
                id[i] = Integer.parseInt(st.nextToken( ));
                num[i] = Integer.parseInt(st.nextToken( ));
            }

            int minSwap =0;
            for (int i = 0; i < n; i++) {
                int max = i;
                for (int j = max+1; j < n; j++) {
                    if(num[j] > num[max]){
                        max = j;
                    }
                    else if( num[j] == num[max] && id[j] < id[max]){
                        max = j;
                    }
                } 
                if(max != i){
                    int val = id[i];
                    id[i] = id[max];
                    id[max] = val;

                    val = num[i];
                    num[i] = num[max];
                    num[max] = val;

                    minSwap++;
                }
            }
            pw.println(minSwap);

        }
        pw.flush();
    }
}