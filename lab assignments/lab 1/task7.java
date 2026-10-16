
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class task7{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int test = Integer.parseInt(bf.readLine());
        while(test>0){

            int n = Integer.parseInt(bf.readLine());
            int[] id = new int[n];
            int[] mark = new int[n];
            st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < id.length; i++) {
                id[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < mark.length; i++) {
                mark[i] = Integer.parseInt(st.nextToken());
            }

            int minSwap =0;

            for (int i = 0; i < n; i++) {
                int max = i;
                for (int j = max+1; j < n; j++) {
                    if(mark[j] > mark[max]){
                        max = j;
                    }
                    else if( mark[j] == mark[max] && id[j] < id[max]){
                        max = j;
                    }
                } 
                if(max != i){
                    int val = id[i];
                    id[i] = id[max];
                    id[max] = val;

                    val = mark[i];
                    mark[i] = mark[max];
                    mark[max] = val;

                    minSwap++;
                }
            }
            pw.println("Minimum swaps: " + minSwap);
            for (int i = 0; i < n; i++) {
                pw.println("ID: " + id[i] + " Mark: " + mark[i]);
            }
            test--;
        }
        pw.flush();
    }
}