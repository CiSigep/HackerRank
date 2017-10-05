using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] unsorted = new string[n];
        for(int unsorted_i = 0; unsorted_i < n; unsorted_i++){
           unsorted[unsorted_i] = Console.ReadLine();   
        }
        Array.Sort(unsorted, new StringComparer());
        StringBuilder sb = new StringBuilder();
        foreach(string s in unsorted)
            sb.Append(s + "\n");
        Console.WriteLine(sb);
    }
}
class StringComparer : Comparer<string> {
    public override int Compare(string a, string b){
        if(a.Length == b.Length){
            int i = 0;
            while(i < a.Length && a[i] == b[i])
                i++;
            return i == a.Length ? 0 : (int) a[i] - (int) b[i]; 
        }
        else{
            return a.Length - b.Length;
        }
            
    }
}
