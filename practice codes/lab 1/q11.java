import java.io.*;

class q11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            Long n = Long.parseLong(br.readLine( ));
            int sum=0;
            while(n>0){
                Long t = n%10;
                if(t%2==0){
                    sum+=t;
                }
                n = n/10;
            }
            pw.println(sum);
        }
        pw.flush();
    }
}