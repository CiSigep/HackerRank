import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Even pages on left, with Odd pages being equal to the Even page + 1
        // Odd pages on right, with Even pages being equal to the Odd page - 1
        // Starting place always 0, no extra math
        int sPageTurns = (int) Math.floor(p / 2.0);
        int ePageTurns;
        // Case for even number of pages with an odd page to turn to (e.g. p = 5, n = 6, one page turn is needed but math
        // returns 0 with floor) 
        if(n % 2 == 0 && p % 2 == 1)
            ePageTurns = (int) Math.ceil(Math.abs((p - n) / 2.0));
        else
            ePageTurns = (int) Math.floor(Math.abs((p - n) / 2.0));
        
        return (sPageTurns < ePageTurns ? sPageTurns : ePageTurns);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
