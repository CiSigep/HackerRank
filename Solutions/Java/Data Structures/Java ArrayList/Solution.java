import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> integerGroup = new ArrayList<List<Integer>>();
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            int len = in.nextInt();
            integerGroup.add(new ArrayList<Integer>());
            for(int j = 0; j < len; j++)
                integerGroup.get(i).add(in.nextInt());
        }
        
        int q = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            
            if(x < integerGroup.size() && y < integerGroup.get(x).size())
                sb.append(integerGroup.get(x).get(y) + "\n");
            else
                sb.append("ERROR!\n");
        }
        
        System.out.println(sb);
        
        
        
    }
}
