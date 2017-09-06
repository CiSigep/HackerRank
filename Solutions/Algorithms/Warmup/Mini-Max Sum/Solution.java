import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        List<Integer> intList = new ArrayList<Integer>();
        
        for(int i : arr)
            intList.add(i);
        
        Collections.sort(intList);
        
        BigInteger min = BigInteger.valueOf(intList.get(0));
        min = min.add(BigInteger.valueOf(intList.get(1)));
        min = min.add(BigInteger.valueOf(intList.get(2)));
        min = min.add(BigInteger.valueOf(intList.get(3)));
        
        BigInteger max = BigInteger.valueOf(intList.get(1));
        max = max.add(BigInteger.valueOf(intList.get(2)));
        max = max.add(BigInteger.valueOf(intList.get(3)));
        max = max.add(BigInteger.valueOf(intList.get(4)));
        
        System.out.println(min + " " + max);
        
    }
}
