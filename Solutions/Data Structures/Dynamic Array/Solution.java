import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, q;
        n = in.nextInt();
        q = in.nextInt();
        
        List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            seqList.add(new ArrayList<Integer>());
        }
        int lastAns = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            int op, x, y;
            op = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            
            int seq = (x ^ lastAns) % n;
            switch(op){
                case 1:
                    seqList.get(seq).add(y);
                    break;
                case 2:
                    lastAns = seqList.get(seq).get(y % seqList.get(seq).size());
                    sb.append(lastAns + "\n");
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
