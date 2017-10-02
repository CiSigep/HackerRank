using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int alternatingCharacters(string s){
        int total = 0;
        int i = 0;
        while(i < s.Length){
            int deletions = 0;
            while(i + 1 + deletions < s.Length && s[i] == s[i + 1 + deletions])
                deletions++;
            total += deletions;
            i += 1 + deletions;
        }
        return total;    
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int result = alternatingCharacters(s);
            Console.WriteLine(result);
        }
    }
}
