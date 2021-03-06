using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static string isValid(string s){ // Misunderstood the problem last time
        Dictionary<char, int> amount = new Dictionary<char, int>();
        foreach(char c in s){
            if(amount.ContainsKey(c))
                amount[c] += 1;
            else
                amount.Add(c, 1);
        }
        int[] freq = amount.Values.Distinct().ToArray();
        // Successful cases
        // No odd ones out(only one frequency of characters)
        if(freq.Length == 1)
            return "YES";
        else if (freq.Length == 2){
            // Odd one out has only one
            int oneCount = amount.Values.Count(x => x == 1);
            if(oneCount == 1)
                return "YES";
        
            // Odd one out is one bigger than the rest
            int value0Count = amount.Values.Count(x => x == freq[0]);
            int value1Count = amount.Values.Count(x => x == freq[1]);
            if((value0Count == 1 && freq[0] - 1 == freq[1]) || (value1Count == 1 && freq[1] - 1 == freq[0]))
                return "YES";
        }
        else
            return "NO";
        
        return "NO";
        

    }

    static void Main(String[] args) {
        string s = Console.ReadLine();
        string result = isValid(s);
        Console.WriteLine(result);
    }
}
