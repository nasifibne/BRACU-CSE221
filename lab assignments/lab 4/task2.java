import java.io.*;
import java.util.*;

public class task2 {

    public static class node {
        int to;
        int weight;

        node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] u = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] w = new int[m];
        for (int i = 0; i < m; i++) {
            w[i] = Integer.parseInt(st.nextToken());
        }
        List <List<node>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            list.get(u[i]).add(new node(v[i], w[i]));
        }
        for (int i = 1; i <=n ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append( " : ");
            List<node> temp = list.get(i);
            for (int j = 0; j < temp.size(); j++) {
                node val = temp.get(j);
                sb.append(" (").append(val.to).append(",").append(val.weight).append(")");
            }
            pw.println(sb.toString());
        }

        pw.flush();
    }
}