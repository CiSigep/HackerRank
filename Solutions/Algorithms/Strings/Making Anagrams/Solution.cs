using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int makingAnagrams(string s1, string s2){
        Dictionary<char, int> amount1 = new Dictionary<char, int>();
        foreach(char c in s1){
            if(amount1.ContainsKey(c))
                amount1[c] += 1;
            else
                amount1.Add(c, 1);
        }
        Dictionary<char, int> amount2 = new Dictionary<char, int>();
        foreach(char c in s2){
            if(amount2.ContainsKey(c))
                amount2[c] += 1;
            else
                amount2.Add(c, 1);
        }
        
        int deletions = 0;
        foreach(KeyValuePair<char,int> kvp in amount1){ // Find difference in amounts between two and remove from s2
            int val = 0;
            amount2.TryGetValue(kvp.Key, out val); 
            deletions += Math.Abs(kvp.Value - val);
            amount2.Remove(kvp.Key);
        }
        foreach(KeyValuePair<char, int> kvp in amount2){ // Add any remaining characters in s2 to deletion count
            deletions += kvp.Value;
        }
        return deletions;
    }

    static void Main(String[] args) {
        string s1 = Console.ReadLine();
        string s2 = Console.ReadLine();
        int result = makingAnagrams(s1, s2);
        Console.WriteLine(result);
    }
}
