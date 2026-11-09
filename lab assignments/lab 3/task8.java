import java.io.*;
import java.util.*;

public class task8 {
    static int[] in;
    static int[] post;
    static int[] idx;
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        in = new int[n];
        post = new int[n];
        idx = new int[n+1];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            in[i] = Integer.parseInt(st.nextToken());
            idx[in[i]] = i;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            post[i] = Integer.parseInt(st.nextToken());
        }

        build(0, n-1 , 0 , n-1);
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append(" ");
        }
        pw.println(sb);
        pw.flush();
    }
    public static void build(int instart , int inend , int poststart , int postend){

        if(instart> inend || poststart>postend){
            return ;
        }
        int root = post[postend];
        ans.add(root);

        int rootIdx = idx[root];
        int leftSize = rootIdx - instart;
        
        build(instart, rootIdx-1, poststart, poststart + leftSize-1);

        build(rootIdx + 1, inend, poststart + leftSize , postend-1);

    }
}