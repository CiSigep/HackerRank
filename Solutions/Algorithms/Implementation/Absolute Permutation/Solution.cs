using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            string[] tokens_n = Console.ReadLine().Split(' ');
            int n = Convert.ToInt32(tokens_n[0]);
            int k = Convert.ToInt32(tokens_n[1]);
            
            if(0 == k){
                for(int i = 1; i <= n; i++)
                    Console.Write(i + " ");
                Console.WriteLine();
            }
            else if(n % (2 * k) != 0)
                Console.WriteLine(-1);
            else{
                List<int> permutation = new List<int>();
                bool plus = true;
                for(int i = 1; i <= n; i++){
                    if(plus)
                        permutation.Add(i + k);
                    else
                        permutation.Add(i - k);
                    
                    if(i % k == 0){
                        if(plus)
                            plus = false;
                        else
                            plus = true;
                    }
                }
                    
                foreach(int i in permutation)
                    Console.Write(i +" ");
                
                Console.WriteLine();
            }
                
        }
        
    }
}
