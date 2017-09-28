using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string S = Console.ReadLine();
        string sos = "SOS";
        int count = 0;
        for(int i = 0; i < S.Length; i++)
            if(sos[i % 3] != S[i])
                count++;
        
        Console.WriteLine(count);
    }
}
