import java.io.*;
import java.util.*;

public class Solution {
    
    

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, String> words = createWordMap();
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), m = in.nextInt();
        
        
        if(m == 0)
            System.out.println(words.get(h) + " o\' clock");
        else if(m == 30)
            System.out.println("half past " + words.get(h));
        else{
            StringBuilder sb = new StringBuilder();
            boolean firstHalf = m > 0 && m < 30;
            if((m > 0 && m <= 20) || (m >= 40 && m < 60)){
                int value = firstHalf ? m : 60 - m;
                sb.append(words.get(value));
                if(value != 15){
                	sb.append(" minute");
                	if(value != 1)
                		sb.append("s");
                }
                sb.append(firstHalf ? " past " : " to " );
            }
            else if((m > 20 && m < 30) || (m > 30 && m < 40)){
                int digit = firstHalf ? m - 20 : 60 - m - 20;
                String append = firstHalf ? "past " : "to ";
                sb.append(words.get(20) + " " + words.get(digit) + " minutes " + append);
            }
            sb.append(firstHalf ? words.get(h) : (h != 12 ? words.get(h + 1) : words.get(1)));
            
            System.out.println(sb.toString());

        }
        
        
    }
    
    private static Map<Integer, String> createWordMap(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        return map;
    }
    
    
}
