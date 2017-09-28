using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Solution {
class Solution {
    static void Main(string[] args) {
        string s = Console.ReadLine().ToLower();
        List<char> toRemove = new List<char>();
        for(int i = 97; i <= 122; i++)
            toRemove.Add((char) i);
        
        for(int i = 0; i < s.Length && toRemove.Count > 0; i++)
            toRemove.Remove(s[i]);
            
        Console.WriteLine(toRemove.Count == 0 ? "pangram" : "not pangram");
    }
}
}
