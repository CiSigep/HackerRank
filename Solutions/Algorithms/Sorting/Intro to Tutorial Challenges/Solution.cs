using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int v = Convert.ToInt32(Console.ReadLine());
        int n = Convert.ToInt32(Console.ReadLine());
        string[] vals = Console.ReadLine().Split(' ');
        for(int i = 0; i < n; i++)
            if(v == Convert.ToInt32(vals[i])){
                Console.WriteLine(i);
                break;
            }
    }
}
