//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String, Integer> directory = new HashMap<String, Integer>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
          
         directory.put(name, phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         Integer pn = directory.get(s);
          
         if(pn != null)
             System.out.println(s + "=" + pn);
         else
             System.out.println("Not found");
      }
   }
}
