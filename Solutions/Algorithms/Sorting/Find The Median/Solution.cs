using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        Console.ReadLine();
        string[] input = Console.ReadLine().Split(' ');
        List<int> values = new List<int>();
        foreach(string s in input){
            values.Add(Convert.ToInt32(s));
        }
        values.Sort();
        
        Console.WriteLine(values[values.Count / 2]);
    }
}
