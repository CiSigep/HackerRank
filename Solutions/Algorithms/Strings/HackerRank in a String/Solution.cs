using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        string find = "hackerrank";
        
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int i = 0;
            for(int j = 0; j < s.Length; j++){
                if(find[i] == s[j])
                    i++;
                if(i == find.Length)
                    break;
            }
            
            Console.WriteLine(i == find.Length ? "YES" : "NO");
        }
        
    }
}
