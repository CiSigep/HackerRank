import java.util.Scanner;


class MyCalculator {
    
    public long power(int val, int pow) throws Exception {
        if(val == 0 && pow == 0)
            throw new Exception("n and p should not be zero.");
        if(val < 0 || pow < 0)
            throw new Exception("n or p should not be negative.");
        
        
        int value = 1;
        for(int i = 0; i < pow; i++)
            value *= val;
        
        return value;
    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
