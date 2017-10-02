using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int palindromeIndex(string s){
        if(isPalindrome(s))
            return -1;
        for(int i = 0; i < s.Length / 2; i++){
            if(s[i] != s[s.Length - (i + 1)])
                if(isPalindrome(s.Substring(0, i) + s.Substring(i + 1)))
                    return i;
                else if(isPalindrome(s.Substring(0, s.Length - (i + 1)) + s.Substring(s.Length - (i))))
                    return s.Length - (i + 1);
                else
                    return -1;
        }
        return -1;
    }
    
    static bool isPalindrome(string s){
        for(int i = 0; i < s.Length / 2; i++)
            if(s[i] != s[s.Length  - (i + 1)])
                return false;
        return true;
    }
 
    static void Main(String[] args) {
        int q = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < q; a0++){
            string s = Console.ReadLine();
            int result = palindromeIndex(s);
            Console.WriteLine(result);
        }
    }
}
