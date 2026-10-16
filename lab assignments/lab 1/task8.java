import java.io.*;
import java.util.*;

public class task8{

    static class train{
        String name;
        String ln;
        int time;
        int ind;

        public train (String temp , int i){
            this.ind = i;
            this.ln = temp;
            String[] parts = temp.split(" ");
            this.name = parts[0];
            String[] val = parts[parts.length-1].split(":");
            this.time = Integer.parseInt(val[0]) *60 + Integer.parseInt(val[1]);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = null;

        int n = Integer.parseInt(bf.readLine());

        train[] trains  = new train[n];
        for (int i = 0; i < n; i++) {
            trains[i] = new train(bf.readLine(), i);

        }

        Arrays.sort(trains , (train a , train b)->{
            int flag = a.name.compareTo(b.name);
            if (flag != 0 ) return flag;
            if(a.time != b.time ) return b.time- a.time;
            return a.ind - b.ind;
        });


        for (int i = 0; i < n; i++) {
            pw.println(trains[i].ln);
        }
        pw.flush();


            
    }


}