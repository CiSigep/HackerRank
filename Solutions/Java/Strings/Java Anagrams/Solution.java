import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      if(A.length() != B.length())
          return false;
       
      List<Character> aChars = new ArrayList<Character>();
      List<Character> bChars = new ArrayList<Character>();
       
      addToList(aChars, A.toUpperCase());
      addToList(bChars, B.toUpperCase());

       
      Collections.sort(aChars);
      Collections.sort(bChars);
       
      char[] aArr = getPrimArray(aChars);
      char[] bArr = getPrimArray(bChars);
       
      String sortedA = new String(aArr);
      String sortedB = new String(bArr);
      
      return sortedA.equals(sortedB);
   }
    
   static void addToList(List<Character> list, String str){
       for(char c : str.toCharArray())
           list.add(c);
   }
    
   static char[] getPrimArray(List<Character> list){
       char[] chars = new char[list.size()];
       int i = 0;
       for(Character c : list){
           chars[i] = c;
           i++;
       }
       return chars;
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
