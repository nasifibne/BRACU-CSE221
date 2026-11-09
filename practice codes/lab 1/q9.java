import java.io.*;

class q9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int n = Integer.parseInt(br.readLine( ));

            if(n>0){
                if(n%2==0){
                    pw.println("POSITIVE EVEN");
                }
                else{
                    pw.println("POSITIVE ODD");
                }
            }
            else if(n<0) {
                if(n%2==0){
                    pw.println("NEGATIVE EVEN");
                }
                else{
                    pw.println("NEGATIVE ODD");
                }
            }
            else{
                pw.println("ZERO");
            }
        }
        pw.flush();
    }
}