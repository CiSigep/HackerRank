import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){
            System.out.println(0);
            scan.close();
            return;
        }
        String s = scan.nextLine().trim();
        String[] split = s.split("[\\s!.,_\'@?]+");
        StringBuilder sb = new StringBuilder();
        sb.append(split.length + "\n");
        
        for(String ss : split)
            sb.append(ss + "\n");
        
        System.out.println(sb);
        
        scan.close();
    }
}
