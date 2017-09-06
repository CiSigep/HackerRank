import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        try{
            SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ssa");
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
            Date d = sdf1.parse(time);
            System.out.println(sdf2.format(d));
        }
        catch(ParseException p)
        {p.printStackTrace();}
    }
}
