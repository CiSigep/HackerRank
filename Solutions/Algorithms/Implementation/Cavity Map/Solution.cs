using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] grid = new string[n];
        
        for(int grid_i = 0; grid_i < n; grid_i++){
           grid[grid_i] = Console.ReadLine();
            if(n <= 2)
                Console.WriteLine(grid[grid_i]);
        }
        if(n > 2){
            for(int i = 1; i < n - 1; i++){
                if(i == 1)
                    Console.WriteLine(grid[0]);
                for(int j = 1; j < n - 1; j++){
                    if(j == 1)
                        Console.Write(grid[i][0]);
                    if(grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i][j - 1] && grid[i][j] > grid[i][j + 1])
                        Console.Write("X");
                    else
                        Console.Write(grid[i][j]);
                    if(j == n - 2)
                        Console.WriteLine(grid[i][n - 1]);

                }
                if(i == n - 2)
                    Console.WriteLine(grid[n - 1]);
            }
        }
    }
}
