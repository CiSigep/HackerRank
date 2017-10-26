import java.util.Scanner;
import java.time.LocalDate;
public class Solution {
    public static String getDay(String day, String month, String year) {
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int y = Integer.parseInt(year);
        
        LocalDate ld = LocalDate.of(y, m, d);
        
        return ld.getDayOfWeek().toString();
        
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
