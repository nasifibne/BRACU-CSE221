
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class q3{
    public static void main(String[] args) throws  Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new  PrintWriter(System.out);
        
        int t = Integer.parseInt(bf.readLine( ));
        while (t-->0){

            int n = Integer.parseInt(bf.readLine( ));
            pw.println( (n*(n+1))/2 );
        }
        pw.flush();
    }
}