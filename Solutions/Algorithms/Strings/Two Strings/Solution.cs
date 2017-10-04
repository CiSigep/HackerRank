using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string twoStrings(string s1, string s2){
        // At least one of the characters in s1 must be in s2
        string test = new string(s1.Distinct().ToArray());
        foreach(char c in test)
            if(s2.Contains(c))
                return"YES";
        
        return "NO";
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s1 = Console.ReadLine();
            string s2 = Console.ReadLine();
            string result = twoStrings(s1, s2);
            Console.WriteLine(result);
        }
    }
}
