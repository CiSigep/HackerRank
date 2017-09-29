using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int gemstones(string[] arr){
        HashSet<char> cs = new HashSet<char>();
        foreach(char c in arr[0])
            cs.Add(c);
        List<char> inAll = new List<char>();
        foreach(char c in cs){
            bool inEvery = true;
            foreach(string s in arr)
                if(!s.Contains(c)){
                    inEvery = false;
                    break;
                }
            if(inEvery)
                inAll.Add(c);
        }
        return inAll.Count;        
    }

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] arr = new string[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
           arr[arr_i] = Console.ReadLine();   
        }
        int result = gemstones(arr);
        Console.WriteLine(result);
    }
}
