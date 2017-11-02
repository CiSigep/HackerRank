import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            int subValue = 0;
            for(int j = i; j < n; j++){
                subValue += a[j];
                if(subValue < 0)
                    count++;
            }
            
        }
        System.out.println(count);
        
        
    }
}
