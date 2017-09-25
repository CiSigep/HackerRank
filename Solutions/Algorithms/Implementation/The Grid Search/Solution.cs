using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            string[] tokens_R = Console.ReadLine().Split(' ');
            int R = Convert.ToInt32(tokens_R[0]);
            Convert.ToInt32(tokens_R[1]);
            string[] G = new string[R];
            for(int G_i = 0; G_i < R; G_i++){
               G[G_i] = Console.ReadLine();   
            }
            string[] tokens_r = Console.ReadLine().Split(' ');
            int r = Convert.ToInt32(tokens_r[0]);
            Convert.ToInt32(tokens_r[1]);
            string[] P = new string[r];
            for(int P_i = 0; P_i < r; P_i++){
               P[P_i] = Console.ReadLine();   
            }
            
            Console.WriteLine(runTest(G, P) ? "YES" : "NO");
        }
        
        
        
    }
    
    private static bool runTest(string[] G, string[] P){
        for(int i = 0; i + P.Length <= G.Length; i++){
            for(int k = 0; k + P[0].Length <= G[i].Length; k++){
                int index = G[i].IndexOf(P[0], k);
                if(index >= 0){ // Still viable matches in current row
                    bool match = true;
                    int j;
                    for(j = 1; i + j < G.Length && j < P.Length; j++)
                        if(G[i + j].IndexOf(P[j], k) != index){ // subsequent matching rows must line up with top
                            match = false;
                            break;
                        }
                    if(match == true && j == P.Length)
                        return true;

                }
                else
                    break; // Index is -1, target string doesn't appear anymore, go to next line 
            }
        }
        return false;
    }
        
}
