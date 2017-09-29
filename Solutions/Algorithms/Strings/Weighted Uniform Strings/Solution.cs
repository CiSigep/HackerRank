using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string s = Console.ReadLine();
        HashSet<int> uWeights = new HashSet<int>();
        for(int i = 0; i < s.Length;){
            int len = 0;
                while(i + len < s.Length && s[i + len] == s[i]){
                    uWeights.Add(((int) s[i + len] - 96) * (len + 1));
                    len++;
                }
            i += len;
        }
        int n = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < n; a0++){
            int x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(uWeights.Contains(x) ? "Yes" : "No");
        }
    }
}
