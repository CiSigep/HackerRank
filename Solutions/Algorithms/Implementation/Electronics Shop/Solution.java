import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        List<Integer> kbs = Arrays.stream(keyboards).boxed().collect(Collectors.toList());  
        List<Integer> ds = Arrays.stream(drives).boxed().collect(Collectors.toList()); 
        Collections.sort(kbs);
        Collections.reverse(kbs);
        Collections.sort(ds);
        
        int value = -1;
        
        for(int k : kbs)
        {
            if(k < s) // Skip keyboards that are too expensive
            {
                for(int i = 0; i < ds.size() && k + ds.get(i) <= s; i++){
                    int currentPrice = k + ds.get(i);
                    if(currentPrice > value && currentPrice <= s)
                        value = currentPrice;
                }
            }
        }
        
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
