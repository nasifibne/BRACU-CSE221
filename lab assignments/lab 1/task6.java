
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class task6{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int n = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < arr.length; j++) {
            for(int i = 0; i < n-1; i++) {
                if( arr[i] %2==0 && arr[i+1]%2==0){
                    if(arr[i]> arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
                else if(arr[i] %2!=0 && arr[i+1]%2!=0){
                    if(arr[i]> arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            pw.print(arr[i] + " "); 
        }
        pw.flush();
    }
}