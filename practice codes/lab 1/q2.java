
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class q2{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int t = Integer.parseInt(bf.readLine( ));
        while (t>0 ){
            st = new StringTokenizer(bf.readLine( ));
            st.nextToken( );
            int x = Integer.parseInt(st.nextToken( ));
            String opp = st.nextToken( );
            int y = Integer.parseInt(st.nextToken( ));

            
            if (opp.equals("+") ) {
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

            t--;
        }
        pw.flush();
    }
}