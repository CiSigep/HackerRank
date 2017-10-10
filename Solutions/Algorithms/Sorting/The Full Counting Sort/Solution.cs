using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
class Solution {
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        List<Val> vals = new List<Val>();
        SortedDictionary<int, int> frequency = new SortedDictionary<int, int>(); // SortedDictionary sorts by key
        for(int i = 0; i < n; i++)
        {
            string[] tokens = Console.ReadLine().Split(' ');
            Val nVal = new Val();
            nVal.SortValue = Convert.ToInt32(tokens[0]);
            nVal.val = tokens[1];
            if(!frequency.ContainsKey(nVal.SortValue)) // Add our values if they don't exist yet
                frequency.Add(nVal.SortValue, 1);
            else
                frequency[nVal.SortValue]++;
            
            vals.Add(nVal);
        }
        StringBuilder sb = new StringBuilder(); // I/O is slow, build the output, then show it
        foreach(KeyValuePair<int, int> kvp in frequency){
            int curInd = -1;
            int amount = kvp.Value;
            while(amount > 0){
                curInd = vals.FindIndex(curInd + 1, x => x.SortValue == kvp.Key); // Find each one matching our key
                sb.Append(curInd < vals.Count / 2 ? "- " : vals[curInd].val + " ");
                amount--;
            }
        }
        Console.WriteLine(sb.ToString());
    }
    
    private class Val{
        public int SortValue {get; set;}
        public string val {get; set;}
    }
}
