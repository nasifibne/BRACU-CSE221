import java.io.*;

class q10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            int count =0;
            
            Long n = Long.parseLong(br.readLine( ));
            if(n==0){
                count = 1;
            }
            while (n>0){
                n = n/10;
                count++;
            }
            pw.println(count);
        }
        pw.flush();
    }
}