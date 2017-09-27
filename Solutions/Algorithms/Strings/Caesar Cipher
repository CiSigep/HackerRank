using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        /*int n = */Convert.ToInt32(Console.ReadLine());
        string s = Console.ReadLine();
        int k = Convert.ToInt32(Console.ReadLine());
        int kMod = k % 26;
        
        if(kMod != 0){
            char[] encode  = new char[s.Length];
            for(int i = 0; i < s.Length; i++){
                int code = (int) s[i];
                if((code >= 65 && code <= 90)){
                    int kAdd = kMod;
                    code += kAdd;
                    if(code > 90)
                        code -= 26;
                }
                else if (code >= 97 && code <= 122){
                    int kAdd = kMod;
                    code += kAdd;
                    if(code > 122)
                        code -= 26;
                }
              encode[i] = (char) code;
            }
            s = new string(encode);
        }
        Console.WriteLine(s);
    }
}
