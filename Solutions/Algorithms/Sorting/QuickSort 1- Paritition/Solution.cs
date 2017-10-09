using System;
using System.Collections.Generic;
using System.IO;
class Solution {
static void partition(int[] ar) {
    List<int> eq = new List<int>();
    eq.Add(ar[0]);
    List<int> left = new List<int>();
    List<int> right = new List<int>();
    
    for(int i = 1; i < ar.Length; i++){
        if(ar[i] > eq[0])
            right.Add(ar[i]);
        else if(ar[i] < eq[0])
            left.Add(ar[i]);
        else
            eq.Add(ar[i]);
    }
    List<int> all = new List<int>(left);
    all.AddRange(eq);
    all.AddRange(right);
    foreach(int i in all)
        Console.Write(i + " ");
    Console.WriteLine();

}
/* Tail starts here */
    static void Main(String[] args) {
           
           int _ar_size;
           _ar_size = Convert.ToInt32(Console.ReadLine());
           int [] _ar =new int [_ar_size];
           String elements = Console.ReadLine();
           String[] split_elements = elements.Split(' ');
           for(int _ar_i=0; _ar_i < _ar_size; _ar_i++) {
                  _ar[_ar_i] = Convert.ToInt32(split_elements[_ar_i]); 
           }

           partition(_ar);
    }
}
