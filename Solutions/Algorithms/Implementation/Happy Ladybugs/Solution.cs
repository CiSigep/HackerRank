using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
class Solution {

    static void Main(String[] args) {
        int Q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < Q; a0++){
            int n = Convert.ToInt32(Console.ReadLine());
            string b = Console.ReadLine().Trim();
            int blankSpaces = b.Count(x => x == '_');
            // Cases:
            // n == 1
            if(n == 1)
                Console.WriteLine("_".Equals(b) ? "YES" : "NO");
            // No movement
            else if(blankSpaces == 0){
                
                Console.WriteLine(Regex.IsMatch(b, "^(([A-Z])\\2+)+$") ? "YES" : "NO");
            }
            // Movement
            else if(blankSpaces > 0){
                Dictionary<char, int> numberBugs = new Dictionary<char, int>();
                foreach(char c in b){
                    if(c != '_'){
                        if(!numberBugs.ContainsKey(c))
                            numberBugs[c] = 0;
                        numberBugs[c] = numberBugs[c] + 1;
                    }
                }
                bool possible = true;
                foreach(int i in numberBugs.Values)
                    if(i == 1){
                        possible = false;
                        break;
                    }
                Console.WriteLine(possible ? "YES" : "NO");
                 
            }
        }
    }
}
