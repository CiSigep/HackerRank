using System;
using System.Collections.Generic;
using System.IO;
class Solution {
static void insertionSort(int[] ar) {
    for (int i = 0; i < ar.Length - 1; i++)
    {
        for (int j = i + 1; j > 0; j--)
        {
            if (ar[j - 1] > ar[j])
            {
                int temp = ar[j - 1];
                ar[j - 1] = ar[j];
                ar[j] = temp;
            }
        }
        foreach(int ind in ar)
            Console.Write(ind + " ");
        Console.WriteLine();
    }      
}
static void Main(String[] args) {
           
           int _ar_size;
           _ar_size = Convert.ToInt32(Console.ReadLine());
           int [] _ar =new int [_ar_size];
           String elements = Console.ReadLine();
           String[] split_elements = elements.Split(' ');
           for(int _ar_i=0; _ar_i < _ar_size; _ar_i++) {
                  _ar[_ar_i] = Convert.ToInt32(split_elements[_ar_i]); 
           }

           insertionSort(_ar);
    }
}
