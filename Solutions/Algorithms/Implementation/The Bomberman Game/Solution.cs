using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
class Solution {
    static void Main(String[] args) {
        string[] tokens = Console.ReadLine().Split(' ');
        int r = Convert.ToInt32(tokens[0]);
        int c = Convert.ToInt32(tokens[1]);
        int n = Convert.ToInt32(tokens[2]);
        
        List<string> initial = new List<string>();
        List<string> filled = new List<string>();
        for(int i = 0; i < r; i++){
            initial.Add(Console.ReadLine());
            filled.Add(new string('O', c));
        }
        if(n == 1) // n is at initial state
            foreach(string s in initial){
                Console.WriteLine(s);
            }
        else if(n == 2){
                printBoard(filled);
        }
        else {
            List<string> detonationOne = detonate(initial);
            
            if(n == 3)
                printBoard(detonationOne);
            else {
                List<string> detonationTwo = detonate(detonationOne);

                if(isEmpty(detonationOne)){
                    if(n % 4 == 3)
                        printBoard(detonationOne);
                    else
                        printBoard(filled);
                }
                else if(isEmpty(detonationTwo)){
                    if(n % 4 == 1)
                        printBoard(detonationTwo);
                    else
                        printBoard(filled);
                }
                else{
                    if(n % 2 == 0)
                        printBoard(filled);
                    else{
                        if(n % 4 == 3)
                            printBoard(detonationOne);
                        else if(n % 4 == 1)
                            printBoard(detonationTwo);
                    }
                }
            }
        }
        
        
    }
    
    private static List<string> detonate(List<string> detonator){
        List<string> after = new List<string>();
        List<StringBuilder> aftersb = new List<StringBuilder>();
        
        foreach(string s in detonator)
            aftersb.Add(new StringBuilder(s));
        
        for(int i = 0; i < detonator.Count; i++){
            for(int j = 0; j < detonator[i].Length; j++){
                if((i > 0 && detonator[i - 1][j] == 'O') || (i < detonator.Count - 1 && detonator[i + 1][j] == 'O') ||
                   (j > 0 && detonator[i][j - 1] == 'O') || (j < detonator[i].Length - 1 && detonator[i][j + 1] == 'O') ||
                   detonator[i][j] == 'O')
                    aftersb[i][j] = '.';
                else
                    aftersb[i][j] = 'O';
            }
                
        }
        
        foreach(StringBuilder sb in aftersb)
            after.Add(sb.ToString());
            
        return after;
    }
    
    private static bool isEmpty(List<string> board){
        foreach(string s in board)
            if(s.Contains("O"))
                return false;
        
        return true;
    }
    
    private static void printBoard(List<string> board){
        foreach(string s in board)
            Console.WriteLine(s);
    }
        
}
