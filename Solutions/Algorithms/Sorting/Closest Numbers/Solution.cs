using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
class Solution {
    static void Main(String[] args) {
        Console.ReadLine();
        string[] input = Console.ReadLine().Split(' ');
        
        List<int> values = new List<int>();
        foreach(string s in input)
            values.Add(Convert.ToInt32(s));
        values.Sort();
        
        List<int> minDistanceValues = new List<int>();
        minDistanceValues.Add(values[0]);
        minDistanceValues.Add(values[1]);
        int minDistance = Math.Abs(values[0] - values[1]);
        for(int i = 1; i < values.Count - 1; i++){
            int dist = Math.Abs(values[i] - values[i + 1]);
            if(dist < minDistance){
                minDistanceValues.Clear();
                minDistance = dist;
                minDistanceValues.Add(values[i]);
                minDistanceValues.Add(values[i + 1]);
            }
            else if(dist == minDistance){
                minDistanceValues.Add(values[i]);
                minDistanceValues.Add(values[i + 1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        foreach(int i in minDistanceValues)
            sb.Append(i + " ");
        
        Console.WriteLine(sb);
        
    }
}
