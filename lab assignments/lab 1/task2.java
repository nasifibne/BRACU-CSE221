import java.io.*;
import java.util.*;
 
 
public class task2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;
        int test ;
        test = Integer.parseInt(br.readLine());
        while (0<test--){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            long x = Long.parseLong(st.nextToken());
            String opp = st.nextToken();
            long y = Long.parseLong(st.nextToken());
 
 
            if (opp.equals("+" ) ) {
                pw.println(x+y);
            }
            else if (opp.equals("-")) {
                pw.println(x-y);
            }
            else if(opp.equals("*")) {
                pw.println(x*y);
            }
            else if(opp.equals("/")){
                pw.println((double)x/y) ;
                
            }
            else if(opp.equals("%")){
                pw.println(x%y);
            }
            else if (opp.equals("&")){
                pw.println(x&y);
            }
            else if (opp.equals("|")){
                pw.println(x|y);
            }
            else if (opp.equals("^")){
                pw.println(x^y);
            }
            else if (opp.equals("<<")){
                pw.println(x<<y);
            }
            else if ( opp.equals(">>")){
                pw.println(x>>y);
            }
        
            
            
 
    
        }
        pw.flush();
        System.exit(0);
    }
}