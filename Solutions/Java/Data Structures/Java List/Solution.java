import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
            l.add(in.nextInt());
        
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            String operation = in.next();
            int place = in.nextInt();
            if("Insert".equals(operation)){
                int value = in.nextInt();
                l.add(place, value);
            }
            else if("Delete".equals(operation))
                l.remove(place);
                
        }
        StringBuilder sb = new StringBuilder();
        for(int i : l)
            sb.append(i + " ");
        
        System.out.println(sb);
            
            
            
    }
}
