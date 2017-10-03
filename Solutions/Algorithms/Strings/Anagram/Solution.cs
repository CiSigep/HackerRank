using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int anagram(string s){
        if(s.Length % 2 != 0)
            return -1;
        
        Dictionary<char, int> amount1 = new Dictionary<char, int>();
        Dictionary<char, int> amount2 = new Dictionary<char, int>();
        string s1 = s.Substring(0, s.Length / 2);
        string s2 = s.Substring(s.Length / 2);
        
        
        for(int i = 0; i < s1.Length; i++){
            if(amount1.ContainsKey(s1[i]))
               amount1[s1[i]] = amount1[s1[i]] + 1;
            else
               amount1.Add(s1[i], 1);
               
            if(amount2.ContainsKey(s2[i]))
               amount2[s2[i]] = amount2[s2[i]] + 1;
            else
               amount2.Add(s2[i], 1);
             
        }
        
        int difference = 0;
        foreach(KeyValuePair<char, int> kvp in amount2){
            int amountC = 0;
            if(amount1.TryGetValue(kvp.Key, out amountC)){
                difference += amountC >= kvp.Value ? 0 : Math.Abs(kvp.Value - amountC);
            }
            else
                difference += kvp.Value;
        }
        
        return difference;
    }

    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int result = anagram(s);
            Console.WriteLine(result);
        }
    }
}
