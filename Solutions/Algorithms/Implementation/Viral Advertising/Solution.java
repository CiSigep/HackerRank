import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int liked = 0; 
        int sharedBy = 5;
        for(int i = 0; i < days; i++){
            sharedBy = (int) Math.floor(sharedBy / 2);
            liked += sharedBy;
            sharedBy *= 3;
        }
            
        System.out.println(liked);
        
    }
}
