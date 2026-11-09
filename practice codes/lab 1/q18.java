import java.io.*;
import java.util.*;

class q18 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine( ));
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken( ));
        
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                int temp = arr[i];
                for (int j = 0; j < i; j++) {
                    if(arr[j] == temp){
                        flag = false;
                        break;
                    }

                }
                if(flag){
                    if(sb.length()>0 ) sb.append(" ");
                    sb.append(temp);
                }
            }
            pw.println(sb.toString());

        }

        pw.flush();
    }
}