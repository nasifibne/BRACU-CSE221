import java.io.*;

class q14 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test = Integer.parseInt(br.readLine());
        while (0 < test--) {
            Long n = Long.parseLong(br.readLine( ));
            
            if(n<2){
                pw.println("NEITHER");
            }
            else if(prime(n)){
                pw.println("PRIME");
            } 
            else{
                pw.println("COMPOSITE");
            }
        }
        pw.flush();
        System.exit(0);
    }
    static boolean prime(Long n ){
        boolean prime = true;
        for (int i = 2; i*i <= n; i++) {
            if(n %i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            return true;
        }
        else{
            return false;
        }
    }

}