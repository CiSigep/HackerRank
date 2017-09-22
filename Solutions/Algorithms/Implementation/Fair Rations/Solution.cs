using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        string[] B_temp = Console.ReadLine().Split(' ');
        int[] B = Array.ConvertAll(B_temp,Int32.Parse);
        if(B.Sum() % 2 != 0)
            Console.WriteLine("NO");
        else{
            
            // There must be an even number of odds for this to work
            List<int> oddIndexes = new List<int>();
            for(int i = 0; i < N; i++)
                if(B[i] % 2 == 1)
                    oddIndexes.Add(i);
            int gap = 0;
            for(int i = 0; i < oddIndexes.Count; i += 2)
                gap += Math.Abs(oddIndexes[i + 1] - (oddIndexes[i]));
            int bread = 2 * (gap);
            
            Console.WriteLine(bread);
        }
    }
}
