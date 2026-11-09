import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class task1 {
 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int left = 0 ; 
        int right = n-1;
        String idx ="-1";
        while(left<right){
            int sum = arr[left] + arr[right];
            if (sum == s) {
                idx = (left+1) + " " + (right+1);
                break;
            }
            else if(sum<s){
                left++;
            }
            else if(sum>s){
                right--;
            }
        }
        pw.println(idx);
        pw.flush();
    }
}