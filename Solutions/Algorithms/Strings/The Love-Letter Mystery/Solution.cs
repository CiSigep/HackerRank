using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int theLoveLetterMystery(string s){
        int count = 0;
        for(int i = 0; i < s.Length / 2; i++)
            count += Math.Abs((int) s[i] - (int) s[s.Length  - (i + 1)]);
        
        return count;
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int result = theLoveLetterMystery(s);
            Console.WriteLine(result);
        }
    }
}
