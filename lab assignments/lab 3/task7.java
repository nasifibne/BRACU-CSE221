import java.io.*;
import java.util.*;

public class task7 {
    static int[] in;
    static int[] pre;
    static int[] idx;
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        in = new int[n];
        pre = new int[n];
        idx =new int[n+1];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            in[i] = Integer.parseInt(st.nextToken());
            idx[in[i]] = i;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pre[i] = Integer.parseInt(st.nextToken());
        }

        build(0, n-1 , 0 , n-1);
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append(" ");
        }
        pw.println(sb);
        pw.flush();
    }
    public static void build(int instart , int inend , int prestart , int preend){

        if(instart> inend || prestart>preend){
            return ;
        }
        int root = pre[prestart];
        int rootIdx = idx[root];
        int leftSize = rootIdx - instart;

        build(instart, rootIdx-1, prestart + 1, prestart + leftSize);

        build(rootIdx + 1, inend, prestart + leftSize + 1, preend);

        ans.add(root);
    }
}