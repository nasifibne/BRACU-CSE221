import java.io.*;
import java.util.*;

public class task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int minR = Math.max(1, x-1);
        int maxR = Math.min(n, x+1);

        int minC = Math.max(1, y-1);
        int maxC = Math.min(n, y+1);

        int count=0;

        StringBuilder sb = new StringBuilder();

        for (int i = minR; i <= maxR; i++) {
            for (int j = minC; j <= maxC; j++) {
                if(i==x && j==y){
                    continue;
                }
                count++;
                sb.append(i).append(" ").append(j).append("\n");
            }
        }
        pw.println(count);
        pw.println(sb.toString());

        pw.flush();
    }
}