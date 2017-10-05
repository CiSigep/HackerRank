import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        int back = ar[ar.length - 1];
        
        int i = ar.length - 2;
        while(back < ar[i])
        {
            
            
            ar[i + 1] = ar[i];
            
            for(int j = 0; j < ar.length; j++)
                System.out.print(ar[j] + " ");
            System.out.println();
            if(back < ar[i])
                i--;
            
            if(i == -1)
                break;
        }
        
        ar[i + 1] = back;
        for(int j = 0; j < ar.length; j++)
                System.out.print(ar[j] + " ");
        System.out.println();
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
