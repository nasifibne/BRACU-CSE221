    import java.io.*;
    import java.util.*;

    public class task4 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            StringTokenizer st = null;
            int test ,n;
            test = Integer.parseInt(br.readLine());
            while (0 < test--) {
                st = new StringTokenizer(br.readLine());
                n = Integer.parseInt(st.nextToken());
                
                st = new StringTokenizer(br.readLine());
                int[] m = new int[n];
                for (int i = 0; i < n; i++) {
                    m[i] = Integer.parseInt(st.nextToken());
                }
                boolean sort = true;
                for (int i = n-1; i > 0; i--) {
                    if(m[i] < m[i-1]){
                        sort = false;
                        break;
                    }
                }

                if(sort) pw.println("YES");
                else pw.println("NO");
            }
            pw.flush();
            System.exit(0);
        }
    }