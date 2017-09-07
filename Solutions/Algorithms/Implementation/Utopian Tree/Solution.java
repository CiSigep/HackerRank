import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for(int i = 0; i < tests; i++)
        {
            int testNum = in.nextInt();
            int answer = (int)(Math.pow(2, Math.floor((testNum + 3)/2))) + (int)((Math.pow(-1, testNum) - 3) / 2);
            System.out.println(answer);
        }
    }
}
