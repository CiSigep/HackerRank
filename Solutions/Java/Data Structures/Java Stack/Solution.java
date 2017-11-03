import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack<Character> st = new Stack<Character>();
       
      while (sc.hasNext()) {
         String input=sc.next();
         boolean failed = false;
         for(int i = 0 ; i < input.length() ; i++)
         {
             char c = input.charAt(i);
             
             if(c == '{')
                 st.push('}');
              if(c == '[')
                 st.push(']');
             if(c == '(')
                 st.push(')');
             try{
                if((c == '}' || c == ']' || c == ')') && !new Character(c).equals(st.peek())){
                	failed = true;
                    break;
                }
                 else if((c == '}' || c == ']' || c == ')') && new Character(c).equals(st.peek()))
                     st.pop();
             }catch(EmptyStackException ese){
            	 failed = true;
                 break;
             }
                 
         }
         System.out.println(st.isEmpty() && !failed);
         st.clear();
      }
      
   }
}
