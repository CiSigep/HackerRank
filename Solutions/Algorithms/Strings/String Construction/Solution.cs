using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int stringConstruction(string s) {
        return s.Distinct().Count(); // All you need is to count the distinct characters in the string, as once they're
                                     // added, they become free to add again
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int result = stringConstruction(s);
            Console.WriteLine(result);
        }
    }
}
