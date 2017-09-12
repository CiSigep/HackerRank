import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fine = 0;
        int d_r = in.nextInt(), m_r = in.nextInt(), y_r = in.nextInt(); // returned date
        int d_e = in.nextInt(), m_e = in.nextInt(), y_e = in.nextInt(); // expected date
        
        if(d_r > d_e && m_r == m_e && y_r == y_e) // same Month & Year
            fine = 15 * (d_r - d_e);
        else if(m_r > m_e && y_r == y_e) // same Year 
            fine = 500 * (m_r - m_e);
        else if(y_r > y_e)
            fine = 10000;
        
        System.out.println(fine);
            
    }
}
