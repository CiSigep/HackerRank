using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int tests = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < tests; i++){
            int n = Convert.ToInt32(Console.ReadLine());
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());
            int min = Math.Min(a, b);
            int max = Math.Max(a, b);
            int lowerBound = (n - 1) * min;
            int upperBound = (n - 1) * max;
            if(max == min) // Only one aswer if our values are the same
                Console.WriteLine(lowerBound);
            else
            {
                int dif = max - min;
                int val = lowerBound;
                while(val <= upperBound){
                    Console.Write(val + " ");
                    val += dif;
                }
                Console.WriteLine();
            }
            
        }
            
    }
}
