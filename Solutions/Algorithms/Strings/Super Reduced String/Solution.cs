using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
class Solution {

    static string super_reduced_string(string s){
        StringBuilder sb = new StringBuilder(s);
        int removals;
        do{
            removals = 0;
            for(int i = 0; i < sb.Length - 1; i++)
                if(sb[i] == sb[i + 1]){
                    sb.Remove(i, 2);
                    i--; // Step back because next i will be in current i slot after removal
                    removals++;
                }
        }while(removals > 0 && sb.Length > 0);
        
        return sb.Length > 0 ? sb.ToString() : "Empty String";
    }

    static void Main(String[] args) {
        string s = Console.ReadLine();
        string result = super_reduced_string(s);
        Console.WriteLine(result);
    }
}
