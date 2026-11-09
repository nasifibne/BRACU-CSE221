import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class q1{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(bf.readLine());
        while (t>0 ){
            
            int n = Integer.parseInt(bf.readLine());
            if(n!=0 && n%2==0){
                pw.println("Even");
            }
            else if(n%2!=0){
                pw.println("Odd");
            }
            else{
                pw.println("Zero");
            }


            t--;
        }
        pw.flush();
    }
}