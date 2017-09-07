import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        
        for(int i = 0; i < numTests; i++){
            int students = in.nextInt();
            int studentsRequired = in.nextInt();
            int onTimeStudents = 0;
            for(int j = 0; j < students; j++){
                if(in.nextInt() <= 0)
                    onTimeStudents++;
            }
            System.out.println(onTimeStudents >= studentsRequired ? "NO" : "YES");
            
        }
    }
}
