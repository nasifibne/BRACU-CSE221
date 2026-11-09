import java.io.*;

class q12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            Long n = Long.parseLong(br.readLine( ));
            if(n==0){
                pw.println(0);
                continue;
            }
            long reverse =0;
            while(n>0){
                long digit = n%10;
                reverse = reverse*10+digit;
                n /=10;
            }
            pw.println(reverse);
        }
        pw.flush();
    }
}