using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] freq = new int[100];
        string[] x = Console.ReadLine().Split(' ');
        for(int i = 0; i < n; i++)
            freq[Convert.ToInt32(x[i])]++;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++)
            for(int j = 0; j < freq[i]; j++)
                sb.Append(i + " ");
        
        Console.WriteLine(sb);
    }
}
