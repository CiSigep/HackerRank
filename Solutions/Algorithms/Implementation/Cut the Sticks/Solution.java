import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        List<Integer> sticks = new ArrayList<Integer>(n);
        
        for(int i = 0; i < n; i++)
            sticks.add(in.nextInt());
        
        Collections.sort(sticks);
        int i = 1;
        System.out.println(sticks.size());
        while(sticks.size() > 1)
        {
            if(i < sticks.size() && !sticks.get(0).equals(sticks.get(i))){ // Integer caching causes '==' to be false for
                                                                           // certain Integers, use equals instead
                sticks = sticks.subList(i, sticks.size());
                System.out.println(sticks.size());
                i = 1;
            }
            else if (i >= sticks.size()) // theres more than one remaining stick of the same size (e.g. 2 2) we'll
            	break;                   // end up out of bounds
            else
              i++;
            
        }
        
    }
}
