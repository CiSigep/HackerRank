using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string funnyString(string s){
        for(int i = 1; i < s.Length; i++){
            if(Math.Abs((int) s[i] - (int) s[i - 1]) != Math.Abs((int) s[s.Length - (i + 1)] - (int) s[s.Length - i]))
                return "Not Funny";
        }
        
        return "Funny";
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            string result = funnyString(s);
            Console.WriteLine(result);
        }
    }
}
