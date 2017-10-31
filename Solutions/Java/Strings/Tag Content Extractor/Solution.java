import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      StringBuilder sb = new StringBuilder();
      while(testCases>0){
         String line = in.nextLine();
         Matcher m = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>").matcher(line);
         
          
         
         boolean found = false;
         while(m.find()){
             if(m.group(2).length() > 0){
                 sb.append(m.group(2) + "\n");
                 found = true;
             }
         }
         if(!found){
             sb.append("None\n");
         }
          
         testCases--;
      }
      System.out.println(sb);
   }
}
