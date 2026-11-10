import java.io.*;
import java.util.*;

public class task7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        boolean[][] brd = new boolean[n+1][m+1];
        boolean attack = false;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int u = -2; u <= 2 ; u++) {
                for (int v = -2; v <= 2; v++) {
                    if((Math.abs(u) + Math.abs(v))==3 ){
                        int tempX = x + u;
                        int tempY = y + v;

                        if(tempX >= 1 && tempX<= n && tempY>=1  && tempY<= m){
                            if(brd[tempX][tempY]){
                                attack = true;
                            }
                        }
                    }
                }
            }
            brd[x][y] = true;
        }
        if(attack){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }
        pw.flush();
    }
}