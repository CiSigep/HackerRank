import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try{
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a / b);
            
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getClass().getCanonicalName() + ": " + ae.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
