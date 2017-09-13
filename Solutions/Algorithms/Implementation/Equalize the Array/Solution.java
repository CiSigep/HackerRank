import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> freq = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < n; i++)
        {
            int val = in.nextInt();
            if(freq.containsKey(val))
                freq.put(val, freq.get(val) + 1);
            else
                freq.put(val, 1);
        }   
        
        int highestFreq = 0;
        for(Integer v : freq.values())
        {
            if(v > highestFreq)
            {
                highestFreq = v;
            }
        }
        System.out.println(n - highestFreq);
    }
}
