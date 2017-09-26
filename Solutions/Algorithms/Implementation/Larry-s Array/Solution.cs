using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int T = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < T; i++){
            Console.ReadLine();
            string[] tokens = Console.ReadLine().Split(' ');
            
            List<int> vals = new List<int>();
            foreach(string s in tokens)
                vals.Add(Convert.ToInt32(s));
            
            int count = 0;
            for(int j = 0; j < vals.Count; j++)
                for(int k = j + 1; k < vals.Count; k++)
                    if(vals[j] > vals[k])
                        count++;
            
            Console.WriteLine(count % 2 == 0 ? "YES" : "NO");
                
        }
    }
}
