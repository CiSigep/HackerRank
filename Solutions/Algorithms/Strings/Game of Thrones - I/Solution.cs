using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string gameOfThrones(string s){
        Dictionary<char, int> test = new Dictionary<char, int>();
        
        foreach(char c in s){
            if(test.ContainsKey(c))
                test[c] += 1;
            else
                test.Add(c, 1);
        }

        bool hasOdd = false; // Palindromes only allow one odd amount of a character. An even length string will have two 
                             // if we find one.
        foreach(int val in test.Values){
            if(val % 2 != 0 && !hasOdd)
                hasOdd = true;
            else if(val % 2 != 0 && hasOdd)
                return "NO";
        }
        return "YES";
    }

    static void Main(String[] args) {
        string s = Console.ReadLine();
        string result = gameOfThrones(s);
        Console.WriteLine(result);
    }
}
